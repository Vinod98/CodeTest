package com.cgi.fan.businessrulevalidation;

public class SpeedDirectionValidation implements LogicValidation{
	int currfanspeed=0;
	int nextfanspeed;
	String direction="clockwise";
	
	public void changeSpeed(char s) {
		int p=nextfanspeed;
		if(p>=4){
			p=0;
			System.out.println("fan is off");
			nextfanspeed=p+1;	
			currfanspeed=p;
		}
		else if(p<4){
			if(p==0){
				System.out.println("fan is off");
				nextfanspeed=p+1;
				currfanspeed=0;
			}
			else{
				currfanspeed=p;
				System.out.println("fan is at speed "+p+ " in direction "+ direction);
				nextfanspeed=p+1;
			}
		}
		
		if(p>3){
			currfanspeed=0;
			}
		else{
			currfanspeed=p;
		}
		
		
	}


	public void changeDirection(char c) {

		String direct1="clockwise";
		String direct2 = "anticlockwise";
		if(currfanspeed==0){
			System.out.println("fan is off");
		}else{
		
		if(direction==direct1){
			direction=direct2;
			System.out.println("fan will run in "+direction+ " direction, at speed"+currfanspeed);
		}else if (direction==direct2){
			direction=direct1;
			System.out.println("fan will run in "+direction+ " direction, at speed"+currfanspeed);
		
			}
		}
		
	}
		
		
}