package com.hydom.core.ebean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 房屋信息
 * 
 * @author www.hydom.cn [heou]
 * 
 */
@Entity
@Table(name = "t_house")
public class House {
	@Id
	private String id;

	/** 楼盘名称 **/
	@Column
	private String buildName;

	/** 联系人 **/
	@Column
	private String contact;

	/** 联系电话 **/
	@Column
	private String contactPhone;

	/** 房屋面积 **/
	@Column
	private double space;

	/** 房屋类型 （旧房改造=1、新房=2） **/
	@Column
	private int type = 1;

	/** 地区 **/
	@ManyToOne(cascade = { CascadeType.REFRESH, }, optional = false)
	@JoinColumn(name = "area_id")
	private Area area;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public double getSpace() {
		return space;
	}

	public void setSpace(double space) {
		this.space = space;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}
