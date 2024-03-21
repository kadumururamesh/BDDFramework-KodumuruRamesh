package com.mobile.orange.Utils;

import java.io.File;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


public class IntializeAppiumServer {
	
	private static AppiumDriverLocalService server=null;
	private static AppiumServiceBuilder builder=null;
	
	
	
	private static AppiumDriverLocalService AppiumServerintance() throws InterruptedException {
		
		
		  builder=new AppiumServiceBuilder(); 
		  
		  builder.withAppiumJS(new File("C:/Users/SWETHARAMESH/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"));
		  //builder.usingDriverExecutable(new File("C:/Users/SWETHARAMESH/AppData/Roaming/npm"));
		 // builder.usingDriverExecutable(new File("C:/Program Files/nodejs"));
		  builder.usingPort(4723);
		  System.out.println("3");
		  builder.withIPAddress("127.0.0.1"); 
		  builder.withArgument(GeneralServerFlag.LOCAL_TIMEZONE);
		  builder.withLogFile(new File(System.getProperty("user.dir")+"/logs/ramesh.txt"));
		  
		
		//server=AppiumDriverLocalService.buildDefaultService();
		  server=AppiumDriverLocalService.buildService(builder);
		  
		  System.out.println(server.getUrl());
		return server;
			
		
		
		
		
	}
	
	
	  public static void startAppiumServer() throws InterruptedException { 
		  
		  if(AppiumServerintance()==null || !AppiumServerintance().isRunning()) {
			  AppiumServerintance().start();
			  System.out.println("Appium server started");
		  }else {
			  System.out.println("Appium server already running");
			  AppiumServerintance().stop();
			  AppiumServerintance().start();
			  
			  
		  }
	  }
	  
	  public static void stopAppiumServer() throws InterruptedException {
		  if(AppiumServerintance().isRunning() || AppiumServerintance()!=null) {
			  try {
				AppiumServerintance().stop();
			} catch (InterruptedException e) {
				System.out.println("Appium server stopped");
				//e.printStackTrace();
			}
			  
		  }else {
			  System.out.println("Appium server not started");
		  }
	  }
	 

}
