package com.hydom.base.ebean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	/** 发布时间 **/
	@Temporal(TemporalType.TIMESTAMP)
	private Date issueTime = new Date();

	/** 排序标识 【预留】 **/
	@Column
	private int lv = 1;

	@Column
	private Boolean visible = true;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSumary() {
		return sumary;
	}

	public void setSumary(String sumary) {
		this.sumary = sumary;
	}

	public String getSignImage() {
		return signImage;
	}

	public void setSignImage(String signImage) {
		this.signImage = signImage;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Date getIssueTime() {
		return issueTime;
	}

	public void setIssueTime(Date issueTime) {
		this.issueTime = issueTime;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

}
