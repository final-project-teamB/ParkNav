package com.sparta.parknav.global.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorType {

    NOT_VALID_TOKEN(401, "토큰이 유효하지 않습니다."),
    NOT_TOKEN(401, "토큰이 없습니다."),
    INVALID_ARGUMENT(400, "비어있는 항목이 있습니다."),
    NOT_FOUND_USER(401, "등록된 사용자가 없습니다.")
    ;
    private int code;
    private String msg;

    ErrorType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
