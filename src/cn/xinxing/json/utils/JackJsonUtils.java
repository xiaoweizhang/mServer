package cn.xinxing.json.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * jackjson
 */
public class JackJsonUtils {
	static ObjectMapper objectMapper;
	/**
	 * 解析json
	 * 
	 * @param content
	 * @param valueType
	 * @return
	 */
	public static <T> T fromJson(String content, Class<T> valueType) {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		try {
			return objectMapper.readValue(content, valueType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 生成json
	 * 
	 * @param object
	 * @return
	 */
	public static String toJson(Object object) {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		try {
			return objectMapper.writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
