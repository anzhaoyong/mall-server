package cn.enjoy.mall.dao;

import cn.enjoy.sys.model.SysParam;

public interface SysParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated Tue Oct 31 09:13:55 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated Tue Oct 31 09:13:55 CST 2017
     */
    int insert(SysParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated Tue Oct 31 09:13:55 CST 2017
     */
    int insertSelective(SysParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated Tue Oct 31 09:13:55 CST 2017
     */
    SysParam selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated Tue Oct 31 09:13:55 CST 2017
     */
    int updateByPrimaryKeySelective(SysParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated Tue Oct 31 09:13:55 CST 2017
     */
    int updateByPrimaryKey(SysParam record);

    SysParam selectByCode(String code);
}