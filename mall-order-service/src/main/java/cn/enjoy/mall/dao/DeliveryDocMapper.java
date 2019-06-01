package cn.enjoy.mall.dao;

import cn.enjoy.mall.model.DeliveryDoc;

import java.util.List;

public interface DeliveryDocMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_delivery_doc
     *
     * @mbg.generated Thu Mar 22 10:05:15 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_delivery_doc
     *
     * @mbg.generated Thu Mar 22 10:05:15 CST 2018
     */
    int insert(DeliveryDoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_delivery_doc
     *
     * @mbg.generated Thu Mar 22 10:05:15 CST 2018
     */
    int insertSelective(DeliveryDoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_delivery_doc
     *
     * @mbg.generated Thu Mar 22 10:05:15 CST 2018
     */
    DeliveryDoc selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_delivery_doc
     *
     * @mbg.generated Thu Mar 22 10:05:15 CST 2018
     */
    int updateByPrimaryKeySelective(DeliveryDoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_delivery_doc
     *
     * @mbg.generated Thu Mar 22 10:05:15 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(DeliveryDoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_delivery_doc
     *
     * @mbg.generated Thu Mar 22 10:05:15 CST 2018
     */
    int updateByPrimaryKey(DeliveryDoc record);

    List<DeliveryDoc> selectByOrderId(int orderId);
}