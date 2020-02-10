package com.example.demo;

import java.util.HashMap;

import org.json.JSONException;

public class AcessClass {
	
	
	public String[] roles()
	{
		String role[]= {"manager","team leader","cordinator","service engineer","engineer"};
		
		return role;
	}
    
	public HashMap<String, String> page() throws JSONException
	{
		 HashMap<String, String> hmap = new HashMap<String, String>();

		  hmap.put("manager", "dashboard"); 
	      hmap.put("team leader", "dashboard");
	      hmap.put("cordinator", "dashboard");
	      hmap.put("service engineer", "EngineerDashboard");
	      hmap.put("engineer", "EngineerDashboard");	  
	     
	      
	      return hmap;
	}
}
