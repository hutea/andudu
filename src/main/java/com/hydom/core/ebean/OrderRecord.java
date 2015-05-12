package com.hydom.core.ebean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hydom.account.ebean.Account;

/**
 * 订单修改记录表
 * 
 * <pre>
 * 记录订单的修改记录
 * </pre>
 * 
 * @author www.hydom.cn [heou]
 * 
 */
@Entity
@Table(name = "t_orderrecord")
public class OrderRecord {
	@Id
	private String id;

	/** 业务数据拉取Order **/

	/** 原始订单 **/
	@ManyToOne(cascade = { CascadeType.REFRESH, }, optional = false)
	@JoinColumn(name = "order_id")
	private Order order;

	/** 操作帐户 **/
	@ManyToOne(cascade = { CascadeType.REFRESH, }, optional = false)
	@JoinColumn(name = "account_id")
	private Account accout;

}
