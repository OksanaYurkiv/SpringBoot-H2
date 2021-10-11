package com.crud.h2.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.h2.dto.request.Price;
import com.crud.h2.repository.PriceRepository;

@Service
public class PriceServiceImpl implements PriceService {

	private PriceRepository repository;

	public PriceServiceImpl(PriceRepository repository) {
		    this.repository = repository;
		  }

	@Override
	public List<Price> getPriceList(Date startDate, Long productId, int brandId) throws ParseException {
		return repository.findPrice(startDate, productId, brandId);
	}

	@Override
	public List<Price> getAllPrices() {
		return repository.findAllPrices();
	}
}
