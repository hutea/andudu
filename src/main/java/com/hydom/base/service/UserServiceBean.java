package com.hydom.base.service;

import org.springframework.stereotype.Service;

import com.hydom.base.ebean.User;
import com.hydom.dao.DAOSupport;

@Service
public class UserServiceBean extends DAOSupport<User> implements UserService {

}
