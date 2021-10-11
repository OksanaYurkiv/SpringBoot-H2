package com.crud.h2.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.request.Price;
import com.crud.h2.service.PriceService;

@RestController
public class PriceController {

	private PriceService service;

	public PriceController(PriceService service) {
		    this.service = service;
		  }

	@GetMapping(value = "/preciosFiltrados/{date}/{productId}/{brandId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Price> getPriceList(Model model, @PathVariable String date, @PathVariable long productId,
			@PathVariable int brandId) throws ParseException {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date datef = dateFormat.parse(date);
		List<Price> list = service.getPriceList(datef, productId, brandId);
		model.addAttribute(list);
		return list;
	}

	@GetMapping("/listaPrecios")
	public List<Price> allPrices(Model model) {
		List<Price> list = service.getAllPrices();
		model.addAttribute(list);
		return list;

	}
}
