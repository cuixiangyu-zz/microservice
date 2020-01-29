package com.cxy.ribbonrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;

import java.util.List;

/**
 * @program: microservice
 * @description: 自定义规则
 * @author: CuiXiangYu
 * @create: 2020-01-28 18:37
 **/
public class RibbonRule extends AbstractLoadBalancerRule {

    private int total = 0;    //总共被调用的次数，目前要求每台被调用5次
    private int currentIndex = 0;//当前提供服务的机器号

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    /**
     * 服务器调用规则
     * @param lb
     * @param key
     * @return  返回被调用的服务
     */
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                /*
                 * No servers. End regardless of pass, because subsequent passes
                 * only get more restrictive.
                 */
                return null;
            }

            if(total < 5)
            {
                server = upList.get(currentIndex);
                total++;
            }else {
                total = 0;
                currentIndex++;
                if(currentIndex >= upList.size())
                {
                    currentIndex = 0;
                }

            }

            if (server == null) {
                /*
                 * The only time this should happen is if the server list were
                 * somehow trimmed. This is a transient condition. Retry after
                 * yielding.
                 */
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }

        return server;

    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }
}
