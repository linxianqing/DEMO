//package com.didispace;
//
////import com.alibaba.druid.pool.xa.DruidXADataSource;
//
//import org.apache.tomcat.jdbc.pool.DataSource;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//
//
///**
// * Created by Administrator on 2017/1/16.
// */
//@Configuration
//@EnableAutoConfiguration(exclude = {
//        DataSourceAutoConfiguration.class,
//        HibernateJpaAutoConfiguration.class, //if you are using Hibernate
//        DataSourceTransactionManagerAutoConfiguration.class})
//public class DruidConfigration {
//    private Logger logger = LoggerFactory.getLogger(DruidConfigration.class);
//
//    @Value("${spring.datasource.initialSize}")
//    private int initialSize;
//
//    @Value("${spring.datasource.minIdle}")
//    private int minIdle;
//
//    @Value("${spring.datasource.maxActive}")
//    private int maxActive;
//
//    @Value("${spring.datasource.maxWait}")
//    private int maxWait;
//
//    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
//    private int timeBetweenEvictionRunsMillis;
//
//    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
//    private int minEvictableIdleTimeMillis;
//
//    @Value("${spring.datasource.validationQuery}")
//    private String validationQuery;
//
//    @Value("${spring.datasource.testWhileIdle}")
//    private boolean testWhileIdle;
//
//    @Value("${spring.datasource.testOnBorrow}")
//    private boolean testOnBorrow;
//
//    @Value("${spring.datasource.testOnReturn}")
//    private boolean testOnReturn;
//
//    @Value("${spring.datasource.poolPreparedStatements}")
//    private boolean poolPreparedStatements;
//
//    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
//    private int maxPoolPreparedStatementPerConnectionSize;
//
//    @Value("${spring.datasource.filters}")
//    private String filters;
//
//    //one数据源(主)
//    @Value("${spring.datasource.one.url}")
//    private String dbUrl;
//
//    @Value("${spring.datasource.one.username}")
//    private String username;
//
//    @Value("${spring.datasource.one.password}")
//    private String password;
//
//    @Value("${spring.datasource.one.driver-class-name}")
//    private String driverClassName;
//
//    //two数据源
//    @Value("${spring.datasource.two.url}")
//    private String dbUrl_two;
//
//    @Value("${spring.datasource.two.username}")
//    private String username_two;
//
//    @Value("${spring.datasource.two.password}")
//    private String password_two;
//
//    @Value("${spring.datasource.two.driver-class-name}")
//    private String driverClassName_two;
//
////    //three数据源
////    @Value("${spring.datasource.three.url}")
////    private String dbUrl_three;
////
////    @Value("${spring.datasource.three.username}")
////    private String username_three;
////
////    @Value("${spring.datasource.three.password}")
////    private String password_three;
////
////    @Value("${spring.datasource.three.driver-class-name}")
////    private String driverClassName_three;
//
//    @Bean     //声明其为Bean实例
//    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
//    @Qualifier("oneDataSource")
//    public DataSource oneDataSource() {
//        System.out.println(this.dbUrl);
//        DataSource dataSource = new DataSource();
//        dataSource.setUrl(this.dbUrl);
//        dataSource.setName(username);
//        dataSource.setPassword(password);
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setInitialSize(initialSize);
//        dataSource.setMinIdle(minIdle);
//        dataSource.setMaxActive(maxActive);
//        dataSource.setMaxWait(maxWait);
//        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        dataSource.setValidationQuery(validationQuery);
//        dataSource.setTestWhileIdle(testWhileIdle);
//        dataSource.setTestOnBorrow(testOnBorrow);
//        dataSource.setTestOnReturn(testOnReturn);
//        return dataSource;
//    }
//
//    @Bean     //声明其为Bean实例
//    @Qualifier("twoDataSource")
//    public DataSource twoDataSource() {
//        System.out.println(this.dbUrl_two);
//        DataSource dataSource = new DataSource();
//        dataSource.setUrl(this.dbUrl_two);
//        dataSource.setName(username_two);
//        dataSource.setPassword(password_two);
//        dataSource.setDriverClassName(driverClassName_two);
//        dataSource.setInitialSize(initialSize);
//        dataSource.setMinIdle(minIdle);
//        dataSource.setMaxActive(maxActive);
//        dataSource.setMaxWait(maxWait);
//        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        dataSource.setValidationQuery(validationQuery);
//        dataSource.setTestWhileIdle(testWhileIdle);
//        dataSource.setTestOnBorrow(testOnBorrow);
//        dataSource.setTestOnReturn(testOnReturn);
//        return dataSource;
//    }
//
////    @Bean     //声明其为Bean实例
////    @Qualifier("threeDataSource")
////    public DataSource threeDataSource() {
////        DataSource dataSource = new DataSource();
////        dataSource.setUrl(this.dbUrl_three);
////        dataSource.setName(username_three);
////        dataSource.setPassword(password_three);
////        dataSource.setDriverClassName(driverClassName_three);
////        dataSource.setInitialSize(initialSize);
////        dataSource.setMinIdle(minIdle);
////        dataSource.setMaxActive(maxActive);
////        dataSource.setMaxWait(maxWait);
////        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
////        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
////        dataSource.setValidationQuery(validationQuery);
////        dataSource.setTestWhileIdle(testWhileIdle);
////        dataSource.setTestOnBorrow(testOnBorrow);
////        dataSource.setTestOnReturn(testOnReturn);
////        return dataSource;
////    }
//}
