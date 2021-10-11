package com.crud.h2.repository;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crud.h2.dto.request.Price;

@Repository
public interface PriceRepository {
	
	
	 List<Price> findPrice(Date startDate, Long productId, int brandId) throws ParseException;

	 List<Price> findAllPrices();
}
