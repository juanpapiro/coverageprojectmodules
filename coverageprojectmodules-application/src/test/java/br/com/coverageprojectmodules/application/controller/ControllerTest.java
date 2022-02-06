package br.com.coverageprojectmodules.application.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class ControllerTest {

	@InjectMocks
	private Controller controller;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetProductDescriptionOk() {
		assertTrue(controller.getProductDescription(1).getStatusCode().is2xxSuccessful());
	}
	
	@Test
	public void testGetProductDescription400() {
		assertTrue(controller.getProductDescription(null).getStatusCode().is4xxClientError());
	}
	
}
