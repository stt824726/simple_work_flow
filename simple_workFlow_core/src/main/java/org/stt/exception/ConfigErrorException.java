package org.stt.exception;

/**
 * @description: 配置错误异常
 * @author: shaott
 * @create: 2024-09-20 18:23
 * @Version 1.0
 **/
public class ConfigErrorException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /** 异常信息 */
    private String message;

    public ConfigErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
