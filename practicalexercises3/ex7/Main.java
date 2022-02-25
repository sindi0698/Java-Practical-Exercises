package com.practicalexercises3.ex7;

public class Main {
    public static void main(String[] args){
            System.out.println("1st response");
            Response<String> response = new ResponseBuilder<String>().setMessage("message").setMessageDetail("detail").build();
            System.out.println(response);

            System.out.println("2nd response");
            Response<String> response1 = new ResponseBuilder<String>().setCode(10).setMessage("message1").setMessageDetail("detail1").build();
            System.out.println(response1);

            System.out.println("3rd response");
            Response<String> response2 = new ResponseBuilder<String>().setItem("someItem").setCode(7).setMessage("message2").setMessageDetail("detail2").build();
            System.out.println(response2);

    }
}
