//package com.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import sun.net.www.protocol.http.HttpURLConnection;
//
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.URL;
//import java.net.URLConnection;
//import java.net.URLEncoder;
//import java.util.Map;
//import java.util.regex.Pattern;
//
///**
// * Created by IntelliJ IDEA
// * User:    linxianqing
// * Date:    2017/4/13
// * Email:   linxianqinwork@qq.com
// */
//@Controller
//public class WebController {
//    private URL url = null;
//
//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public String index() {
//        return "index";
//    }
//
//    @RequestMapping("/search")
//    public String search(String urlstr, Map<String, Object> map) throws IOException {
//        String pattern = "[a-zA-z]+://[^\\s]*";
//        boolean matches = Pattern.matches(pattern, urlstr);
//
//        if (matches == true) {
//            url = new URL(urlstr);
////            map.put("path", url.getPath());
////            map.put("authority", url.getAuthority());
////            map.put("content", url.getContent());
////            map.put("defaultport", url.getDefaultPort());
////            map.put("file", url.getFile());
////            map.put("host", url.getHost());
////            map.put("prot", url.getPort());
////            map.put("protocol", url.getProtocol());
////            map.put("query", url.getQuery());
////            map.put("ref", url.getRef());
////            map.put("userinfo", url.getUserInfo());
//            URLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            map.put("AllowUserInteraction", urlConnection.getAllowUserInteraction());
//            map.put("ConnectTimeout", urlConnection.getConnectTimeout());
//            map.put("Content", urlConnection.getContent());
//            map.put("ContentEncoding", urlConnection.getContentEncoding());
//            map.put("ContentLength", urlConnection.getContentLength());
//            map.put("ContentLengthLong", urlConnection.getContentLengthLong());
//            map.put("ContentType", urlConnection.getContentType());
//            map.put("Date", urlConnection.getDate());
//            map.put("UseCaches", urlConnection.getDefaultUseCaches());
//            map.put("DoInput", urlConnection.getDoInput());
//            map.put("DoOutput", urlConnection.getDoOutput());
//            map.put("Expiration", urlConnection.getExpiration());
//            map.put("URL", urlConnection.getURL());
//            urlConnection.connect();
//            DataOutputStream dos=new DataOutputStream(urlConnection.getOutputStream());
//            String param="name="+ URLEncoder.encode("丁丁","UTF-8");
//            dos.writeBytes(param);
//            dos.flush();
//            dos.close();
//        urlConnection.getResponseCode();
//        } else if (matches == false) {
//            map.put("message", "输入的不是url,请重新输入");
//            return "error";
//        }
//        return "information";
//    }
//}
