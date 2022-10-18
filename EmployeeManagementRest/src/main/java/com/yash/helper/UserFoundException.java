package com.yash.helper;

public class UserFoundException extends Exception
{
	public UserFoundException()
	{
	super("User with this Username is already there is DataBase !! try with another one");
	}
	public UserFoundException(String msg)
	{
		super(msg);
	}
}
