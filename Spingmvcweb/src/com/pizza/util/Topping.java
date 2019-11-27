package com.pizza.util;

import java.util.HashMap;

public class Topping {
   public static HashMap<String,Integer> ToppingRate(){
	   HashMap<String,Integer> hm=new  HashMap<String,Integer>();
	   hm.put("Capsicum",30);
	   hm.put("Mushroom",50);
	   hm.put("Jalapeno",70);
	   hm.put("Paneer",85);
	   return hm;
   }
}
