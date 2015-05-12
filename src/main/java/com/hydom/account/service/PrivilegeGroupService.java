package com.hydom.account.service;

import com.hydom.account.ebean.PrivilegeGroup;
import com.hydom.dao.DAO;

public interface PrivilegeGroupService extends DAO<PrivilegeGroup> {

	public PrivilegeGroup findByName(String groupName);

}
