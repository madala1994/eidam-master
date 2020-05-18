package com.eidam.master.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 错误信息返回实体
 * @date 2020/5/18 14:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseEntity {

    private int code;

    private String message;

}
