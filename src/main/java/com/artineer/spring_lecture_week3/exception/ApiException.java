package com.artineer.spring_lecture_week3.exception;

import com.artineer.spring_lecture_week3.vo.ApiCode;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {
    private final ApiCode code;

    public ApiException(ApiCode code) {
        this.code = code;
    }

    public ApiException(ApiCode code, String msg) {
        super(msg);
        this.code = code;
    }
}
