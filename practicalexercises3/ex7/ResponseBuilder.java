package com.practicalexercises3.ex7;

public class ResponseBuilder<T>{
    private T item;
    private Integer code;
    private String message;
    private String messageDetail;

    public ResponseBuilder<T> setItem(T item) {
        this.item = item;
        return this;
    }

    public ResponseBuilder<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public ResponseBuilder<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResponseBuilder<T> setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
        return this;
    }

    public Response<T> build() {
        try {
            Response<T> response = new Response<>(item, code, message, messageDetail);
            if(validate(response)){
                return response;
            }
        }catch (ValidateException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean validate(Response<T> responseObject) throws ValidateException {
        if(responseObject.getCode() == null){
            throw new ValidateException("The code can not be null, please enter another code such that the response can be valid!!");
        }
        return true;
    }
}
