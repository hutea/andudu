package com.hydom.core.service;

import org.springframework.stereotype.Service;

import com.hydom.core.ebean.Order;
import com.hydom.dao.DAOSupport;

@Service
public class OrderRecordServicerBean extends DAOSupport<Order> implements OrderService {

}
