package com.zonefun.cloud.example.common.dto;

/**
 * @ClassName CommonResult
 * @Description 通用返回体
 * @Date 2023/3/28 14:30
 * @Author ZoneFang
 */
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;
}