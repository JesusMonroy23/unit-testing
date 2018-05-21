package com.jesus.testing.data;

public class SomeDataServiceImpl implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		int[] data = {1,2,3,4};
		return data;
	}

}
