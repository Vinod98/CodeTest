package com.cgi.util.fan;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cgi.fan.businessrulevalidation.LogicValidation;
import com.cgi.fan.businessrulevalidation.SpeedDirectionValidation;
import com.cgi.fan.constants.InputConstants;
import com.cgi.fan.ipvalidation.InputValidation;
import com.cgi.fan.ipvalidation.Validation;


public class CeilingFan {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		String input;
		LogicValidation lv = new SpeedDirectionValidation();
		Validation v = new InputValidation();
		System.out.print("Fan is off : To turn on and increase speed Enter "+InputConstants.SPEED +" or to change directon Enter "+InputConstants.DIRECTION );
		
		while(true){
			try{
			if(sc.hasNext()){
				input = sc.next();
		if(v.validate(input)){
			char c=input.charAt(0);
					if(c==InputConstants.DIRECTION){
						lv.changeDirection(c);
					}
					else if(c==InputConstants.SPEED){
						lv.changeSpeed(c);
					}
				}
				else{
					throw new InputMismatchException("please enter either "+InputConstants.SPEED+ " or "+ InputConstants.DIRECTION + " only");
				}
			}
		}
		
			catch(Exception e){
				System.out.println(e.getMessage());
			
				
			}
		}
	}
		
		


}