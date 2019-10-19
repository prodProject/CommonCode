package com.prod.basic.common.httpCommon.Formatter;

import com.prod.basic.common.httpCommon.Enums.RequestContentTypeEnum;
import com.prod.basic.common.httpCommon.Interfaces.IFormatter;

public class RequestContentTypeEnumFormatter implements IFormatter<String, RequestContentTypeEnum> {

	public String format(RequestContentTypeEnum data) {
		switch (data) {
		case CONTENT_TYPE_FORM_URL_ENCODED:
			return "application/x-www-form-urlencoded";
		case CONTENT_TYPE_HTML:
			return "text/html";
		case CONTENT_TYPE_IMG_PNG:
			return "image/png";
		case CONTENT_TYPE_JSON:
			return "application/json";
		case CONTENT_TYPE_PDF:
			return "application/pdf";
		case CONTENT_TYPE_TEXT:
			return "text/plain";
		default:
			return "";
		}
	}

}
