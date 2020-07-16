package com.cg.usermanagement.Exceptions;

@SuppressWarnings("serial")
public class InvalidDetailsException extends Exception{
	public InvalidDetailsException(String error_Msg) {
		super(error_Msg);
	}
}