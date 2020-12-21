package com.mariuspaavel.xmlparser;

public class IllegalIdentifierException extends IllegalBlockException {
	IllegalIdentifierException(){
		super("Illegal characters in identifier string", "");
	}
}
