package com.wangyang.springcloud.entites;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Wang Yang
 * @date 2020/6/17 19:14
 */
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
