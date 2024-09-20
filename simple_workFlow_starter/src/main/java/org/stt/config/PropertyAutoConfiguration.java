package org.stt.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 装配类
 * @author: shaott
 * @create: 2024-09-20 14:23
 * @Version 1.0
 **/
@Configuration
@EnableConfigurationProperties({ WorkFlowProperty.class})
@ConditionalOnProperty(prefix = "workFlow", name = "enable", havingValue = "true")
public class PropertyAutoConfiguration {
}
