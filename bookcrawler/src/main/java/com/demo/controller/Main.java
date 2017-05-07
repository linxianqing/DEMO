package com.demo.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/4/13
 * Email:   linxianqinwork@qq.com
 */
public class Main {
    public static void main(String[] args) throws Exception {
        get();
    }
    public static void get() throws Exception{

        URL url = new URL("http://127.0.0.1/http/demo.do?name=Jack&age=10");
        URLConnection urlConnection = url.openConnection();                                                    // 打开连接
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"utf-8")); // 获取输入流
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }

        System.out.println(sb.toString());
    }
}


// 按指定模式在字符串查找
//        String line = "https://www.baidu.com/" ;
//
//        String pattern = "[a-zA-z]+://[^\\\\s]*";
//
//        // 创建 Pattern 对象
//        Pattern r = Pattern.compile(pattern);
//
//        // 现在创建 matcher 对象
//        Matcher m = r.matcher(line);
//        if (m.find( )) {
//            System.out.println("Found value: " + m.group(0) );
////            System.out.println("Found value: " + m.group(1) );
////           System.out.println("Found value: " + m.group(2) );
////            System.out.println("Found value: " + m.group(3) );
//        } else {
//            System.out.println("NO MATCH");
//        }

//正则
//        String content = "https://www.baidu.com/";
//
//        String pattern = "[a-zA-z]+://[^\\s]*";
//
//        boolean matches = Pattern.matches(pattern, content);
//        System.out.println(matches);

//        URL url = new URL("https://www.baidu.com/");
//        URLConnection urlConnection = url.openConnection();
//        Object content = urlConnection.get;
//        System.out.println(content);
//        String path = url.getPath();
//        logger.info(url.getPath());     //路径
//        System.out.println(path);
//        System.out.println(url.getAuthority()); //数字证书
//        System.out.println();
//    }
//            }
