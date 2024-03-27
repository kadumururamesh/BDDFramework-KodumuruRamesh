package com.mobile.orange.Utils;

import java.io.IOException;
import java.util.Scanner;

public class ADButils {
	
	public static void killADBServer() {
		ADButils.runCommand("adb kill-server");
	}

	private static void command(String string) {
		// TODO Auto-generated method stub
		
	}
	
	private static String runCommand(String command){
	        String output = null;
	        try{
	        	System.out.println("inside runcommand -command");
	            Scanner scanner = new Scanner(Runtime.getRuntime().exec(command).getInputStream()).useDelimiter("\\A");
	            
	            if(scanner.hasNext()) 
	            	output = scanner.next();
	        }catch (IOException e){
	        	System.out.println("error in inside runcommand");
	            throw new RuntimeException(e.getMessage());
	        }
	        return output;
	  }

}
