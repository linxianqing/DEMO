//package com.lingbang.Interceptor;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Created by IntelliJ IDEA
// * User:    linxianqing
// * Date:    2017/5/5
// * Email:   linxianqinwork@qq.com
// */
///*对用户身份进行验证*/
//@Component
//public class AuthInterceptor extends HandlerInterceptorAdapter {
//
//    private static final Logger logger= LoggerFactory.getLogger(AuthInterceptor.class);
//
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
////        String _authorization = request.getHeader("Authorization");
////        logger.info("authorization:{}",_authorization);
////        if(_authorization!=null){
////            request.setAttribute("authorization",_authorization);
////            return true;
////        }else{
////            response.setStatus(403);
////            return false;
////        }
//        return true;
//    }
//
//}
