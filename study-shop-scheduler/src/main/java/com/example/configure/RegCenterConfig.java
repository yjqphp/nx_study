package com.example.configure;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuan
 */
@Configuration
@Data
@ConditionalOnExpression("'${elasticJob.serverlists}'.length()>0")
public class RegCenterConfig {

    @Bean(initMethod = "init")
    public ZookeeperRegistryCenter rgCenter(@Value("${elasticJob.serverlists}") final String serverlist,
                                                  @Value("${elasticJob.namespace}") final String namespace){
        return  new ZookeeperRegistryCenter(new ZookeeperConfiguration(serverlist,namespace));
    }

}
