package com.hydom.base.service;

import org.springframework.stereotype.Service;

import com.hydom.base.ebean.CarouselImage;
import com.hydom.dao.DAOSupport;

@Service
public class CarouselImageServiceBean extends DAOSupport<CarouselImage> implements
		CarouselImageService {

}
