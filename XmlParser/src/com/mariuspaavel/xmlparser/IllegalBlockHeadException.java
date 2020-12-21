package com.mariuspaavel.xmlparser;

public class IllegalBlockHeadException extends IllegalBlockException {
	IllegalBlockHeadException(){}
	IllegalBlockHeadException(String message, String blockname){super(message, blockname);}
}
