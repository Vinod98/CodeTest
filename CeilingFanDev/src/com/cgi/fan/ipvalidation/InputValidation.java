package com.cgi.fan.ipvalidation;

import java.util.InputMismatchException;

import com.cgi.fan.constants.InputConstants;

public class InputValidation implements Validation {

	public boolean validate(String input) {
			boolean valid = false;
			if(input.length()>1){
				throw new InputMismatchException("Please Enter either S or D only");
			} else if (input.charAt(0)==InputConstants.DIRECTION || input.charAt(0)==InputConstants.SPEED){
			valid=true;
			}
			else{
				valid=false;
			}
			return valid;
		
	}

}
