package br.com.coverageprojectmodules.domain.models;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class ProductTest {
	
	@InjectMocks
	private Product product;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getValue() {
		product.setValue(BigDecimal.valueOf(100d));
		product.setDiscount(BigDecimal.valueOf(20d));
		assertEquals(120, product.getValue().intValue());
	}
	
	@Test
	public void getValueNotDiscount() {
		product.setValue(BigDecimal.valueOf(100d));
		assertEquals(100, product.getValue().intValue());
	}

}
