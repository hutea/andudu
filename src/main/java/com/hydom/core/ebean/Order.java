package com.hydom.core.ebean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hydom.base.ebean.User;

/**
 * 监理订单表
 * 
 * @author www.hydom.cn [heou]
 * 
 */
@Entity
@Table(name = "t_order")
public class Order {
	@Id
	private String id;

	/** 订单创建时间 **/
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	/** 监理要求 **/
	@Column
	private int requier;

	/** 监理要求附加说明 **/
	@Column
	private String detail;

	/** 订单所属用户 **/
	@ManyToOne(cascade = { CascadeType.REFRESH, }, optional = false)
	@JoinColumn(name = "user_id")
	private User user;

	/** 预计工期 **/
	@Column
	private double worktime;

	/** 预计工期：开始时间 **/
	@Temporal(TemporalType.TIMESTAMP)
	private Date stime;

	/** 预计工期：结束时间 **/
	@Temporal(TemporalType.TIMESTAMP)
	private Date etime;

	/**
	 * 订单核心状态
	 * <ul>
	 * <li>订单入库：state=0</li>
	 * <li>用户提交：state=1</li>
	 * <li>订单生成：state=2</li>
	 * <li>支付确认：state=3</li>
	 * <li>监理派工：state=4</li>
	 * <li>验收：state=5</li>
	 * </ul>
	 * **/
	private int state;

	/** 订单子状态 辅助订单核心状态 **/
	private int substate;

	/** 是否签订合同 **/
	private Boolean sign;

	/** 合同文件存放路径 **/
	private String contractsFile;

	/** 预定付款金额：根据客户提供公式计算 **/
	private Double initmoney;

	/** 是否付款 **/
	private Boolean pay = false;

	/** 验收是否合格 **/
	private Boolean ck;

	/** 验收说明 **/
	private String ckNote;

	/** 拉取房屋信息数据START **/
	@ManyToOne(cascade = { CascadeType.REFRESH, }, optional = false)
	@JoinColumn(name = "house_id")
	private House house;
	@Column
	private String buildName;
	@Column
	private String contact;
	@Column
	private String contactPhone;
	@Column
	private double space;
	@Column
	private int type = 1;
	private String area;
	/** 拉取房屋信息数据END **/
}
