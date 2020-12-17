package com.itbin.study.nacosconsume.config;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.ribbon.NacosServer;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/19 18:02
 * @description:
 * @modified By:
 */
public class NacosWeightRule extends AbstractLoadBalancerRule {

    @Autowired
    private NacosDiscoveryProperties nacosDiscoveryProperties;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        // 获取服务提供者名称
        BaseLoadBalancer baseLoadBalancer = (BaseLoadBalancer) this.getLoadBalancer();
        String name = baseLoadBalancer.getName();
        // 拿到nacos 服务提供对象
        NamingService namingService = nacosDiscoveryProperties.namingServiceInstance();

        // 根据权重获取实例
        try {
            Instance instance = namingService.selectOneHealthyInstance(name);
            // 封装 server 对象返回
            return new NacosServer(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
