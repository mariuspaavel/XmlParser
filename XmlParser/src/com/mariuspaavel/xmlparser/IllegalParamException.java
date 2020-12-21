package com.mariuspaavel.xmlparser;

public class IllegalParamException extends IllegalBlockHeadException {
	IllegalParamException(){}
	IllegalParamException(String message){super(message, "");}
}
