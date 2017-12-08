package com.jingao.cn.mapper.user;

import com.jingao.cn.entity.user.Users;
import com.jingao.cn.entity.user.UsersExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Tue Sep 26 17:12:28 CST 2017
     */
    int countByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Tue Sep 26 17:12:28 CST 2017
     */
    int deleteByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Tue Sep 26 17:12:28 CST 2017
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Tue Sep 26 17:12:28 CST 2017
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Tue Sep 26 17:12:28 CST 2017
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Tue Sep 26 17:12:28 CST 2017
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERS
     *
     * @mbggenerated Tue Sep 26 17:12:28 CST 2017
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);
}