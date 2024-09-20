package org.stt.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description: 工作类配置参数
 * @author: shaott
 * @create: 2024-09-20 09:19
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "workFlow", ignoreUnknownFields = true)
public class WorkFlowProperty {

    // 是否装配
    private boolean enable;


}
