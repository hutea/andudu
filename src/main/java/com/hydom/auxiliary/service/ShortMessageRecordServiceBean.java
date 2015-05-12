package com.hydom.auxiliary.service;

import org.springframework.stereotype.Service;

import com.hydom.auxiliary.ebean.ShortMessageRecord;
import com.hydom.dao.DAOSupport;

@Service
public class ShortMessageRecordServiceBean extends DAOSupport<ShortMessageRecord> implements
		ShortMessageRecordService {

}
