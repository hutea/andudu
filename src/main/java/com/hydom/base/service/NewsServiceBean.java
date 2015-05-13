package com.hydom.base.service;

import org.springframework.stereotype.Service;

import com.hydom.base.ebean.News;
import com.hydom.dao.DAOSupport;

@Service
public class NewsServiceBean extends DAOSupport<News> implements NewsService {

}
