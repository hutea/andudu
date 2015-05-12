package com.hydom.core.service;

import org.springframework.stereotype.Service;

import com.hydom.core.ebean.House;
import com.hydom.dao.DAOSupport;

@Service
public class HouseServiceBean extends DAOSupport<House> implements HouseService {

}
