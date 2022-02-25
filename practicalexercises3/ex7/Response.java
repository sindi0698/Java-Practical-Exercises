package com.practicalexercises3.ex7;

public final class Response<T>{
    private final T item;
    private final Integer code;
    private final String message;
    private final String messageDetail;

    public Response(T item, Integer code, String message, String messageDetail) {
        this.item = item;
        this.code = code;
        this.message = message;
        this.messageDetail = messageDetail;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Response{" +
                "item=" + item +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", messageDetail='" + messageDetail + '\'' +
                '}';
    }
}
