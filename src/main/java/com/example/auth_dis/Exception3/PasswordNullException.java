package com.example.auth_dis.Exception3;

public class PasswordNullException extends RuntimeException {
    public PasswordNullException(){
        super("비밀번호에 값을 넣어주세요.");
    }
}
