package com.hydom.base.ebean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * 监理公司
 * 
 * @author www.hydom.cn [heou]
 * 
 */
@Entity
@Table(name = "t_company")
public class Company {
	@Id
	private String id;

	/** 本平台【公司】 **/
	private Boolean self = false;

	/** 公司名称 **/
	@Column
	private String name;

	/** 营业执照 **/
	@Column
	private String licence;

	/** 监理资质 **/
	@Column
	private String quality;

	/** 公司介绍 **/
	@Lob
	private String detail;

	/** 联系人 **/
	@Column
	private String contact;

	/** 联系人电话 **/
	@Column
	private String contactPhone;

	/** 法人 **/
	@Column
	private String legal;

	/** 法人 **/
	@Column
	private String legal_idcard;

	/** 法人手机 **/
	@Column
	private String legal_phone;

	/** 公司地址 **/
	@Column
	private String address;

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

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getDetail() {
		return detail;
	}

	public Boolean getSelf() {
		return self;
	}

	public void setSelf(Boolean self) {
		this.self = self;
	}

	public void setDetail(String detail) {
		this.detail = detail;
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

	public String getLegal() {
		return legal;
	}

	public void setLegal(String legal) {
		this.legal = legal;
	}

	public String getLegal_idcard() {
		return legal_idcard;
	}

	public void setLegal_idcard(String legalIdcard) {
		legal_idcard = legalIdcard;
	}

	public String getLegal_phone() {
		return legal_phone;
	}

	public void setLegal_phone(String legalPhone) {
		legal_phone = legalPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 监理案例(最多5个)

}
