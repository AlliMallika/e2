package com.tap.classes;

public class President {
      public String name = "Draupadi Murmu";
      
      private static President p = new President();
      
     

	public String getName() {
		return name;
	}


	public static President getPresident() {
		return p;
	}

	private President() {
    	  
      }
}
