package com.tap.classes;

import com.tap.implementations.IndianAirForce;
import com.tap.implementations.IndianArmy;
import com.tap.implementations.IndianNavy;

public class Launch {
   public static void main(String[] args) {
	    IndianArmy ia = new IndianArmy();
	    IndianNavy in = new IndianNavy();
	    IndianAirForce iaf = new IndianAirForce();
	    
	    
	    ia.addressPresident();
	    in.addressPresident();
	    iaf.addressPresident();
   }
}
