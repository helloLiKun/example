package com.jingao.cn.rep.entity;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDENT.ID
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDENT.NAME
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDENT.AGE
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    private Short age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.ID
     *
     * @return the value of STUDENT.ID
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.ID
     *
     * @param id the value for STUDENT.ID
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.NAME
     *
     * @return the value of STUDENT.NAME
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.NAME
     *
     * @param name the value for STUDENT.NAME
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.AGE
     *
     * @return the value of STUDENT.AGE
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    public Short getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.AGE
     *
     * @param age the value for STUDENT.AGE
     *
     * @mbggenerated Mon Sep 25 16:26:02 CST 2017
     */
    public void setAge(Short age) {
        this.age = age;
    }
}