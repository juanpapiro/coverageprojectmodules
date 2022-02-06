package br.com.coverageprojectmodules.domain.models;

import java.math.BigDecimal;

public class Product {
	
	private Long id;
	private String description;
	private BigDecimal value;
	private BigDecimal discount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getValue() {
		return getValueDiscount();
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	
	private BigDecimal getValueDiscount() {
		return this.discount == null ? this.value : 
			this.value.add(this.value.multiply(this.discount.divide(BigDecimal.valueOf(100d))));
	}

}
