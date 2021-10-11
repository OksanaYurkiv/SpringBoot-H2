package com.crud.h2.dto.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Price {
	
	private Long productId;
	private int brandId;
	private int priceList;
	private Date startDate;
	private Date endDate;
	private Float price;
	

}
