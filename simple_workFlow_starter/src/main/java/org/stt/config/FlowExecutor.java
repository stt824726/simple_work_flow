package org.stt.config;

import cn.hutool.core.util.ObjectUtil;
import lombok.extern.slf4j.Slf4j;
import org.stt.exception.ConfigErrorException;

/**
 * @description: 流程规则主要执行器类
 * @author: shaott
 * @create: 2024-09-20 17:27
 * @Version 1.0
 **/
@Slf4j
public class FlowExecutor {

    private FlowExecutorConfig flowExecutorConfig;

    /**
     * 初始化化方式，主要用于解析规则
     */
    public void init(){
        if (ObjectUtil.isNull(flowExecutorConfig)) {
            throw new ConfigErrorException("config error, please check liteflow config property");
        }


    }
}
