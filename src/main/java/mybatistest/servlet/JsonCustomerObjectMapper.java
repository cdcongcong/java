package mybatistest.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ser.CustomSerializerFactory;
import org.springframework.stereotype.Component;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * 解决SpringMVC使用@ResponseBody返回json时，日期格式默认显示为时间戳的问题。需配合<mvc:message-converters>使用
 * 在springmvc-servlet.xml中也可以配置，所以用不上
 * @author 
 * @date 
 */

@Component("JsonCustomerObjectMapper")
public class JsonCustomerObjectMapper extends ObjectMapper {

		public JsonCustomerObjectMapper() {
			CustomSerializerFactory factory = new CustomSerializerFactory();
			factory.addGenericMapping(Date.class, new JsonSerializer<Date>() {
				@Override
				public void serialize(Date value, JsonGenerator jsonGenerator,
						SerializerProvider provider) throws IOException, JsonProcessingException {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					jsonGenerator.writeString(sdf.format(value));
				}
			});
			this.setSerializerFactory(factory);
		}
	
}
