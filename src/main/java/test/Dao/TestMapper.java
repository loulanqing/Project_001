package test.Dao;

import test.domain.Test;

public interface TestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long te00);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int insertSelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    Test selectByPrimaryKey(Long te00);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Test record);
}