package com.crud.h2.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.crud.h2.dto.request.Price;

public interface PriceService {

	List<Price> getPriceList(Date startDate, Long productId, int brandId) throws ParseException;
    
	List<Price> getAllPrices() ;
}