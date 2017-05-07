package com.demo.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/26 下午9:11.
 * @blog http://blog.didispace.com
 */
@Configuration
public class DataSourceConfig {
//
//    @Bean(name = "oneDataSource")
//    @Qualifier("oneDataSource")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.one")
//    public DataSource oneDataSource() {
//        return DataSourceBuilder.create().build();
//    }

//    @Bean(name = "twoDataSource")
//    @Qualifier("twoDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.two")
//    public DataSource twoDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//    @Bean(name = "threeDataSource")
//    @Qualifier("threeDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.three")
//    public DataSource threeDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//
//    @Bean(name = "oneJdbcTemplate")
//    public JdbcTemplate oneJdbcTemplate(
//            @Qualifier("oneDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//
//    @Bean(name = "twoJdbcTemplate")
//    public JdbcTemplate twoJdbcTemplate(
//            @Qualifier("twoDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//    @Bean(name = "threeJdbcTemplate")
//    public JdbcTemplate threeJdbcTemplate(
//            @Qualifier("threeDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

}
