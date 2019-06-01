package cn.enjoy.mall.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import cn.enjoy.mall.model.Spec;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_spec
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_spec
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int insert(Spec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_spec
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int insertSelective(Spec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_spec
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    Spec selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_spec
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int updateByPrimaryKeySelective(Spec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_spec
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    int updateByPrimaryKey(Spec record);

    List<Spec> selectListByTypeId(Integer typeId);


    /**
     * 分页查询
     * @param name
     * @param pageBounds
     * @return
     * @author Ray
     */
    PageList<Spec> queryByPage(@Param("name") String name, @Param("typeId") Integer typeId, PageBounds pageBounds);

}