package com.jesus.testing.business;

import com.jesus.testing.data.SomeDataService;

public class SomeBussinesImpl {
	
	private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		int sum = 0;
		for(int i:data) {
			sum += i;
		}
		return sum;
	}
	
	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		for(int i:data) {
			sum += i;
		}
		return sum;
	}

}
