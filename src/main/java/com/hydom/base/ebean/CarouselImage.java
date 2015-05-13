package com.hydom.base.ebean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 轮播图片表
 * 
 * 
 * @author www.hydom.cn [heou]
 * 
 */
@Entity
@Table(name = "t_carouselimage")
public class CarouselImage {

	@Id
	private String id;

	private String content;

	/** 图片地址 **/
	@Column
	private String url;

	/** 文字描述 **/
	@Column
	private String detail;

	/** 排序序 **/
	@Column
	private int lv = 1;

	@Column
	private Boolean visible = true;
}
