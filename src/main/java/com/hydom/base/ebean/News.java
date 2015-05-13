package com.hydom.base.ebean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 新闻表
 * 
 * @author www.hydom.cn [heou]
 * 
 */
@Entity
@Table(name = "t_news")
public class News {
	@Id
	private String id;

	/** 标题 **/
	@Column
	private String title;

	/** 内容 **/
	@Column
	private String content;

	/** 摘要 **/
	@Column
	private String sumary;

	/** 标志图 **/
	@Column
	private String signImage;

	@Column
	private Boolean visible = true;

}
