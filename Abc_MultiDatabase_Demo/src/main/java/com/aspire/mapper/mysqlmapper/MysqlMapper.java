package com.aspire.mapper.mysqlmapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * MySQL数据访问层
 *
 * @author JustryDeng
 * @Date 2018年9月1日 上午12:33:59
 */
@Mapper
public interface MysqlMapper {

	/**
	 * 根据id查数据
	 */
	@Select("SELECT name FROM pms_product WHERE id = #{id}")
	String singleSelect(@Param("id") Integer id);

}
