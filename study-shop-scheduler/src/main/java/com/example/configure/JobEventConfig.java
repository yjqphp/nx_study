package com.example.configure;

import com.dangdang.ddframe.job.event.JobEventConfiguration;
import com.dangdang.ddframe.job.event.rdb.JobEventRdbConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author yuan
 */
@Configuration
public class JobEventConfig {

    @Resource
    private DataSource dataSource;

    public JobEventConfiguration jobEventConfiguration(){

        return new JobEventRdbConfiguration(dataSource);
    }
}
