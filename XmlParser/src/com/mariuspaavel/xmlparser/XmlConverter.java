package com.mariuspaavel.xmlparser;

public interface XmlConverter<T> {
	Block toXml();
	T fromXml(Block input);
}
