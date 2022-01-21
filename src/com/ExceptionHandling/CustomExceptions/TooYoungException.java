package com.ExceptionHandling.CustomExceptions;

public class TooYoungException extends RuntimeException {
    TooYoungException(){
        super();
    }
    TooYoungException(String s){
        super(s);
    }

}
