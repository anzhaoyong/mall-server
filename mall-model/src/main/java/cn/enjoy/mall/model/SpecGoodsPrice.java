package cn.enjoy.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SpecGoodsPrice implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_price.id
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_price.goods_id
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_price.key
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    private String key;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_price.key_name
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    private String keyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_price.price
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_price.store_count
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    private Integer storeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_price.bar_code
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    private String barCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_spec_goods_price.sku
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    private String sku;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_price.id
     *
     * @return the value of tp_spec_goods_price.id
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_price.id
     *
     * @param id the value for tp_spec_goods_price.id
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_price.goods_id
     *
     * @return the value of tp_spec_goods_price.goods_id
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_price.goods_id
     *
     * @param goodsId the value for tp_spec_goods_price.goods_id
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_price.key
     *
     * @return the value of tp_spec_goods_price.key
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_price.key
     *
     * @param key the value for tp_spec_goods_price.key
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_price.key_name
     *
     * @return the value of tp_spec_goods_price.key_name
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_price.key_name
     *
     * @param keyName the value for tp_spec_goods_price.key_name
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_price.price
     *
     * @return the value of tp_spec_goods_price.price
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_price.price
     *
     * @param price the value for tp_spec_goods_price.price
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_price.store_count
     *
     * @return the value of tp_spec_goods_price.store_count
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public Integer getStoreCount() {
        return storeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_price.store_count
     *
     * @param storeCount the value for tp_spec_goods_price.store_count
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public void setStoreCount(Integer storeCount) {
        this.storeCount = storeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_price.bar_code
     *
     * @return the value of tp_spec_goods_price.bar_code
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_price.bar_code
     *
     * @param barCode the value for tp_spec_goods_price.bar_code
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_spec_goods_price.sku
     *
     * @return the value of tp_spec_goods_price.sku
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public String getSku() {
        return sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_spec_goods_price.sku
     *
     * @param sku the value for tp_spec_goods_price.sku
     *
     * @mbggenerated Thu Feb 08 09:55:14 CST 2018
     */
    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    private List<SpecGoodsImage> specGoodsImagesList;//规格图片

    public List<SpecGoodsImage> getSpecGoodsImagesList() {
        return specGoodsImagesList;
    }

    public void setSpecGoodsImagesList(List<SpecGoodsImage> specGoodsImagesList) {
        this.specGoodsImagesList = specGoodsImagesList;
    }
}