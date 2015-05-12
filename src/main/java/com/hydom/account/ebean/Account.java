package com.hydom.account.ebean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hydom.base.ebean.User;

/**
 * 帐号表，包括用户帐号、后台管理员帐号
 * 
 * @author www.hydom.cn [heou]
 * 
 */
@Entity
@Table(name = "t_account")
public class Account {
	@Id
	private String id;

	/** 用户名 **/
	@Column(unique = true)
	private String username;

	/** 密码 **/
	@Column
	private String password;

	/** 昵称 **/
	@Column
	private String nickname;

	/** 创建时间 **/
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	/** 逻辑删除标志 **/
	@Column
	private Boolean visible = true;

	@OneToOne(cascade = { CascadeType.REFRESH, }, optional = true)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable(name = "t_account_group", joinColumns = @JoinColumn(name = "acc_id"), inverseJoinColumns = @JoinColumn(name = "g_id"))
	private Set<PrivilegeGroup> groups = new HashSet<PrivilegeGroup>();// 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Set<PrivilegeGroup> getGroups() {
		return groups;
	}

	public void setGroups(Set<PrivilegeGroup> groups) {
		this.groups = groups;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
