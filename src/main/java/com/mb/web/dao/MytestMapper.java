package com.mb.web.dao;

import com.mb.web.domain.Mytest;
import com.mb.web.domain.MytestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MytestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int countByExample(MytestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int deleteByExample(MytestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int insert(Mytest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int insertSelective(Mytest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    List<Mytest> selectByExample(MytestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    Mytest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int updateByExampleSelective(@Param("record") Mytest record, @Param("example") MytestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int updateByExample(@Param("record") Mytest record, @Param("example") MytestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int updateByPrimaryKeySelective(Mytest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myTest
     *
     * @mbggenerated Mon Jul 25 16:41:37 CST 2016
     */
    int updateByPrimaryKey(Mytest record);
}