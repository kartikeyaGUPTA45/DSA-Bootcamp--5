package com.oops.concepts;

public enum HttpStatus {
    OK(200, "Ok"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal server Error");

    public int code;
    public String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        if (this.code < 400) {
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("HttpStatus is: " + this.code + " with message: " + this.message);
    }

    public static HttpStatus fromCode(int code) {
        if (code == 200) {
            return HttpStatus.OK;
        } else if (code == 400) {
            return HttpStatus.BAD_REQUEST;
        } else if (code == 404) {
            return HttpStatus.NOT_FOUND;
        } else if (code == 500) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        } else {
            return null;
        }
    }

}
