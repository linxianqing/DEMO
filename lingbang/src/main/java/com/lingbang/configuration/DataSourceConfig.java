//package com.lingbang.configuration;
//
//import org.apache.tomcat.jdbc.pool.DataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//
///**
// * Created by IntelliJ IDEA
// * User:    linxianqing
// * Date:    2017/5/4
// * Email:   linxianqinwork@qq.com
// */
//@Configuration
//@PropertySource("classpath:application.properties")
//public class DataSourceConfig {
//    @Value("${spring.datasource.driver-class-name}")
//    private String driver;
//    @Value("${spring.datasource.url}")
//    private String url;
//    @Value("${spring.datasource.username}")
//    private String username;
//    @Value("${spring.datasource.password}")
//    private String password;
//    @Bean
//    public DataSource dataSource() {
//        DataSource dataSource = new DataSource();
//        dataSource.setDriverClassName(driver);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword("password");
//        return dataSource;
//    }
//
////    @Bean
////    @Qualifier("primaryDataSource")
////    @ConfigurationProperties(prefix="spring.datasource")
////    public DataSource dataSource() {
////        return DataSourceBuilder.create().build();
////    }
//
////    @Bean(name = "secondaryDataSource")
////    @Qualifier("secondaryDataSource")
////    @Primary
////    @ConfigurationProperties(prefix="spring.datasource.secondary")
////    public DataSource secondaryDataSource() {
////        return DataSourceBuilder.create().build();
////    }
//
//}
