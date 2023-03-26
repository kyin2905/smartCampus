package com.atguigu.campus.utils;

/**
 * ClassName: ResultCodeEnum
 * Package: com.atguigu.campus.utils
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/2/4 - 16:16  16:16
 * @Version: v1.0
 */

import lombok.Getter;

/**
 * 统一返回结果状态信息类
 *
 */
@Getter
public enum ResultCodeEnum {

    /**
     *
     */
    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    TOKEN_ERROR(224,"Token无效!");

    private Integer code;
    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}

