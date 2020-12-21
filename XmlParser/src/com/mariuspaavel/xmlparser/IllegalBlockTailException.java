package com.mariuspaavel.xmlparser;

public class IllegalBlockTailException extends IllegalBlockException {
	IllegalBlockTailException(){}
	IllegalBlockTailException(String message, String blockname){super(message, blockname);}
}
