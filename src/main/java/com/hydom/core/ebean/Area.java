package com.hydom.core.ebean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 地区表 
 * <pre>采取自关联设计，无限级子类</pre>
 * @author www.hydom.cn [heou]
 *
 */
@Entity
@Table(name = "t_area")
public class Area {
	@Id
	private String id;

	/** 地区名称 **/
	@Column
	private String name;

	/** 排序标识 **/
	private int od = 1;

	/** 地区代码【预留】 **/
	private String code;

	/** 上级地区 **/
	@ManyToOne(cascade = CascadeType.REFRESH, optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "area_pid")
	private Area parentArea; // 

	/** 下属地区 **/
	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "parentArea", fetch = FetchType.LAZY)
	private List<Area> areas = new ArrayList<Area>();

	@Column
	private Boolean visible = true;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOd() {
		return od;
	}

	public void setOd(int od) {
		this.od = od;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Area getParentArea() {
		return parentArea;
	}

	public void setParentArea(Area parentArea) {
		this.parentArea = parentArea;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

}
