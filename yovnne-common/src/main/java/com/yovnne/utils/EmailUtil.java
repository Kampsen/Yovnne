package com.yovnne.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


// 邮箱验证
public class EmailUtil {

    public static boolean checkEmail(String email) {
        boolean flag = false;
        try {
            String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /*public static void main(String[] args) {
        boolean checkEmail = checkEmail("1098378566@qq.com");
        System.out.println(checkEmail);
    }*/
}
