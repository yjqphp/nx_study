package com.example.jobs;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yuan
 */
public class OrderSimpleJob implements SimpleJob {

    Logger logger = LoggerFactory.getLogger(OrderSimpleJob.class);
    @Override
    public void execute(ShardingContext shardingContext) {
        switch (shardingContext.getShardingItem()) {
            case 0:
                logger.info("job名称={},分片数量={},当前分片名称={},当前自定义参数={} ===",shardingContext.getJobName(),shardingContext.getShardingTotalCount(),shardingContext.getShardingItem(),shardingContext.getShardingParameter());
                break;
            case 1:
                logger.info("job名称={},分片数量={},当前分片名称={},当前自定义参数={} ===",shardingContext.getJobName(),shardingContext.getShardingTotalCount(),shardingContext.getShardingItem(),shardingContext.getShardingParameter());
                break;
            case 2:
                logger.info("job名称={},分片数量={},当前分片名称={},当前自定义参数={} ===",shardingContext.getJobName(),shardingContext.getShardingTotalCount(),shardingContext.getShardingItem(),shardingContext.getShardingParameter());
                break;
        }
    }
}
