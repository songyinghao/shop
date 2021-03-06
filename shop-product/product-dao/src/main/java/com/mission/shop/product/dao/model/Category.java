package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.cat_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Long catId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.parent_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Long parentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.name
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.status
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Short status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.sort_order
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Short sortOrder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.level
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Short level;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.is_leaf
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private String isLeaf;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table category
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.cat_id
	 * @return  the value of category.cat_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Long getCatId() {
		return catId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.cat_id
	 * @param catId  the value for category.cat_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setCatId(Long catId) {
		this.catId = catId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.parent_id
	 * @return  the value of category.parent_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Long getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.parent_id
	 * @param parentId  the value for category.parent_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.name
	 * @return  the value of category.name
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.name
	 * @param name  the value for category.name
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.status
	 * @return  the value of category.status
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.status
	 * @param status  the value for category.status
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.sort_order
	 * @return  the value of category.sort_order
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Short getSortOrder() {
		return sortOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.sort_order
	 * @param sortOrder  the value for category.sort_order
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setSortOrder(Short sortOrder) {
		this.sortOrder = sortOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.create_time
	 * @return  the value of category.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.create_time
	 * @param createTime  the value for category.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.update_time
	 * @return  the value of category.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.update_time
	 * @param updateTime  the value for category.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.level
	 * @return  the value of category.level
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Short getLevel() {
		return level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.level
	 * @param level  the value for category.level
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setLevel(Short level) {
		this.level = level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.is_leaf
	 * @return  the value of category.is_leaf
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public String getIsLeaf() {
		return isLeaf;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.is_leaf
	 * @param isLeaf  the value for category.is_leaf
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf == null ? null : isLeaf.trim();
	}
}