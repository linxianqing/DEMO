//package com.lingbang.configuration;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * Created by IntelliJ IDEA
// * User:    linxianqing
// * Date:    2017/5/5
// * Email:   linxianqinwork@qq.com
// */
//@Configuration
//@EnableWebMvc
//public class WebMvcConfig extends WebMvcConfigurerAdapter {
////
////    @Autowired
////    private AuthInterceptor authInterceptor;
////
////    @Override
////    public void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor(authInterceptor);
////    }
////
////    @Bean
////    public FilterRegistrationBean corsFilter() {
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        CorsConfiguration config = new CorsConfiguration();
////        config.setAllowCredentials(true);
////        config.addAllowedOrigin("*");
////        config.addAllowedHeader("*");
////        config.addAllowedMethod("*");
////        source.registerCorsConfiguration("/cors", config);
////        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
////        bean.setOrder(0);
////        return bean;
////    }
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/cors");
//    }
//
//}
