package com.qdtg.gitpurview.pojo;

/**
 * @program: git-purview
 * @description: 统一返回结果
 * @author: JavaLitterBoy
 * @create: 2018-09-13 10:37
 **/

public class Result {
    private int code;
    private String message;
    private String data;

    public Result(int code, String message,String data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result ok(){
        return new Result(200,"成功",null);
    }

    public static Result ok(String message){
        return new Result(200,message,null);
    }

    public static Result ok(String message,String data){
        return new Result(200,message,data);
    }
}
