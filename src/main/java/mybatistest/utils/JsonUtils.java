package mybatistest.utils;

import java.io.StringWriter;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtils {

	/**
	 * Bean转Json（未格式化）
	 */
	public static String bean2JsonString(Object src) {
		ObjectMapper m = new ObjectMapper();
		
		StringWriter stringWriter = new StringWriter();
		try {
			JsonGenerator jsonGenerator = m.getJsonFactory().createJsonGenerator(
					stringWriter);
			jsonGenerator.writeObject(src);  
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return stringWriter.toString();
	}

	/**
	 * Bean转Json（已格式化）
	 */
	public static String Bean2JsonFormatString(Object src) {
		String json = "";
		return json;
	}
	
	
}
