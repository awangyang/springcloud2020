package com.wangyang.springcloud.commom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Wang Yang
 * @date 2020/6/17 19:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult implements Serializable {

    private int code;
    private String message;
    private Object data;

    public static CommonResult success(String message, Object data) {
        return new CommonResult(200, message, data);
    }

    public static CommonResult fail(String message) {
        return new CommonResult(500, message, null);
    }
}
