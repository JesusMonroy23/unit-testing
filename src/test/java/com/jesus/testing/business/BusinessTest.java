package com.jesus.testing.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jesus.testing.data.SomeDataService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessTest {
	
	@Mock
	private SomeDataService someData;
	

	private SomeBussinesImpl bussines; 

	@Test
	public void CalculateSum_basicScenario() {
		bussines = new SomeBussinesImpl();
		int actual = bussines.calculateSum(new int[] {1,2,3});
		assertEquals(6, actual);
	}
	
	@Test
	public void CalculateSum_usingDataServiceAndMock() {
		bussines = new SomeBussinesImpl();
		bussines.setSomeDataService(someData);
		when(someData.retrieveAllData()).thenReturn(new int[] {1,2,3,4});
		int actual = bussines.calculateSumUsingDataService();
		assertEquals(10, actual);
	}
	
	@Test
	public void CalculateSum_usingDataServiceAndOtherWayToMockWithoutAnnotation() {
		bussines = new SomeBussinesImpl();
		SomeDataService data = mock(SomeDataService.class);	//usign mock without annotation
		bussines.setSomeDataService(data);
		when(data.retrieveAllData()).thenReturn(new int[] {1,2,3});
		int actual = bussines.calculateSumUsingDataService();
		assertEquals(6, actual);
	}

}
