package com.example.dbconnection.entity.dto.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.checkerframework.checker.units.qual.A;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralResponse {
    private int code;
    private String errmessage;
    private String message;
    private Object data;

    public GeneralResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
