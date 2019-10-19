package com.prod.basic.common.httpCommon.Formatter;

import com.prod.basic.common.httpCommon.Enums.RequestMethodEnum;
import com.prod.basic.common.httpCommon.Interfaces.IFormatter;

public class RequestMethodEnumFormatter implements IFormatter<String, RequestMethodEnum> {

	public String format(RequestMethodEnum data) {
		switch (data) {
		case DELETE:
			return "DELETE";
		case GET:
			return "GET";
		case PATCH:
			return "PATCH";
		case POST:
			return "POST";
		case PUT:
			return "PUT";
		default:
			return "";
		}
	}

}
