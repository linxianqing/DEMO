//package com.lingbang.configuration;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
///**
// * Created by IntelliJ IDEA
// * User:    linxianqing
// * Date:    2017/5/4
// * Email:   linxianqinwork@qq.com
// */
//@Configuration
////这个注解导入刚才增加的jdbc配置文件
//@PropertySource("classpath:application.properties")
//public class DataSourceConfiguration {
//    @Value("${spring.datasource.driver-class-name}")
//    private String driver;
//    @Value("${spring.datasource.url}")
//    private String url;
//    @Value("${spring.datasource.username}")
//    private String username;
//    @Value("${spring.datasource.password}")
//    private String password;
////    @Value("${jdbc.maxActive}")
////    private int maxActive;
////    @Value("${jdbc.maxIdel}")
////    private int maxIdel;
////    @Value("${jdbc.maxWait}")
////    private long maxWait;
//
//
//    @Bean
//    public DataSourceBuilder dataSource(){
//        DataSourceBuilder dataSourceBuilder = new DataSourceBuilder(this.);
//        dataSourceBuilder.driverClassName(driver);
//        dataSourceBuilder.url(url);
//        dataSourceBuilder.username(username);
//        dataSourceBuilder.password(password);
////        dataSource.setMaxActive(maxActive);
////        dataSource.setMaxIdle(maxIdel);
////        dataSource.setMaxWait(maxWait);
////        dataSource.setValidationQuery("SELECT 1");
////        dataSource.setTestOnBorrow(true);
//        return dataSourceBuilder;
//    }
//}