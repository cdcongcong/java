package mybatistest.utils;

import java.io.StringWriter;



//jackson 1.9.3 ->2.4.3 包名、类全变了 
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.*;

public class JsonUtils {

	/**
	 * Bean转Json（未格式化）
	 */
	public static String bean2JsonString(Object src) {
		ObjectMapper m = new ObjectMapper();
		m.setDateFormat(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		//Include.Include.ALWAYS 默认  
		//Include.NON_DEFAULT 属性为默认值不序列化  
		//Include.NON_EMPTY 属性为 空（“”）  或者为 NULL 都不序列化  
		//Include.NON_NULL 属性为NULL 不序列化  
		m.setSerializationInclusion(Include.NON_NULL);  
		String json = "";
		
//		StringWriter stringWriter = new StringWriter();
		try {
//			JsonGenerator jsonGenerator = m.getJsonFactory().createJsonGenerator(
//					stringWriter);
//			jsonGenerator.writeObject(src);  
			json = m.writeValueAsString(src);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return json;
	}

	/**
	 * Bean转Json（已格式化）
	 */
	public static String Bean2JsonFormatString(Object src) {
		ObjectMapper m = new ObjectMapper();
		m.setDateFormat(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		//Include.Include.ALWAYS 默认  
		//Include.NON_DEFAULT 属性为默认值不序列化  
		//Include.NON_EMPTY 属性为 空（“”）  或者为 NULL 都不序列化  
		//Include.NON_NULL 属性为NULL 不序列化  
		m.setSerializationInclusion(Include.NON_NULL); 
		String json = "";
		try {
			json = m.writerWithDefaultPrettyPrinter().writeValueAsString(src);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	
	
}
