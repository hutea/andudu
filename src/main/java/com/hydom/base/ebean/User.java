package com.hydom.base.ebean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.hydom.account.ebean.Account;

/**
 * 用户表
 * 
 * @author www.hydom.cn [heou]
 * 
 */
@Entity
@Table(name = "t_user")
public class User {
	@Id
	private String id;

	/** 手机号 **/
	@Column
	private String phone;

	/** 年龄 **/
	@Column
	private int age;

	/** 性别 **/
	@Column
	private int sex;

	@OneToOne(cascade = { CascadeType.REFRESH, }, optional = true, mappedBy = "user")
	private Account account;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
