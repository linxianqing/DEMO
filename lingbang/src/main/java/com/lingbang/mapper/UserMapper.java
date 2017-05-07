package com.lingbang.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_users",
        "where OID = #{oid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_users (OID, USER_ID, ",
        "USERNAME, PASSWORD, ",
        "NAME, TELNO, PHONENO, ",
        "CREDITNO, ADDRESS, ",
        "SEX, BIRTHDAY, OWNEHOUSE, ",
        "OWNEPRO, CLASSES)",
        "values (#{oid,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{telno,jdbcType=CHAR}, #{phoneno,jdbcType=VARCHAR}, ",
        "#{creditno,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=SMALLINT}, #{birthday,jdbcType=CHAR}, #{ownehouse,jdbcType=VARCHAR}, ",
        "#{ownepro,jdbcType=VARCHAR}, #{classes,jdbcType=SMALLINT})"
    })
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="OID", property="oid", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="USERNAME", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TELNO", property="telno", jdbcType=JdbcType.CHAR),
        @Result(column="PHONENO", property="phoneno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREDITNO", property="creditno", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.SMALLINT),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.CHAR),
        @Result(column="OWNEHOUSE", property="ownehouse", jdbcType=JdbcType.VARCHAR),
        @Result(column="OWNEPRO", property="ownepro", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLASSES", property="classes", jdbcType=JdbcType.SMALLINT)
    })
    List<User> selectByExample(UserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "OID, USER_ID, USERNAME, PASSWORD, NAME, TELNO, PHONENO, CREDITNO, ADDRESS, SEX, ",
        "BIRTHDAY, OWNEHOUSE, OWNEPRO, CLASSES",
        "from t_users",
        "where OID = #{oid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="OID", property="oid", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType= JdbcType.VARCHAR),
        @Result(column="USERNAME", property="username", jdbcType= JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TELNO", property="telno", jdbcType=JdbcType.CHAR),
        @Result(column="PHONENO", property="phoneno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREDITNO", property="creditno", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.SMALLINT),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.CHAR),
        @Result(column="OWNEHOUSE", property="ownehouse", jdbcType=JdbcType.VARCHAR),
        @Result(column="OWNEPRO", property="ownepro", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLASSES", property="classes", jdbcType=JdbcType.SMALLINT)
    })
    User selectByPrimaryKey(String oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_users
     *
     * @mbg.generated
     */
    @Update({
        "update t_users",
        "set USER_ID = #{userId,jdbcType=VARCHAR},",
          "USERNAME = #{username,jdbcType=VARCHAR},",
          "PASSWORD = #{password,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "TELNO = #{telno,jdbcType=CHAR},",
          "PHONENO = #{phoneno,jdbcType=VARCHAR},",
          "CREDITNO = #{creditno,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "SEX = #{sex,jdbcType=SMALLINT},",
          "BIRTHDAY = #{birthday,jdbcType=CHAR},",
          "OWNEHOUSE = #{ownehouse,jdbcType=VARCHAR},",
          "OWNEPRO = #{ownepro,jdbcType=VARCHAR},",
          "CLASSES = #{classes,jdbcType=SMALLINT}",
        "where OID = #{oid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);
}