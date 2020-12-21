package com.mariuspaavel.xmlparser;

public class IllegalCommentException extends XmlParsingException {
	IllegalCommentException(){}
	IllegalCommentException(String message){super(message);}
}
