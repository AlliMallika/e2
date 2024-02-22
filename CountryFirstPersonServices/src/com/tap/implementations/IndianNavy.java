package com.tap.implementations;

import com.tap.classes.President;
import com.tap.interfaces.Services;

public class IndianNavy implements Services {

	@Override
	public void addressPresident() {
		
//		President p = new President();
		
		
		President p = President.getPresident();
//		System.out.println("President is : "+p.name);


		System.out.println(p);

	}

}
