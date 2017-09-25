package mybatistest.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//jackson 1.9.3 ->2.4.3 包名、类全变了 
import com.fasterxml.jackson.databind.*;
import org.springframework.stereotype.Component;

/**
 * 解决SpringMVC使用@ResponseBody返回json时，日期格式默认显示为时间戳的问题。需配合<mvc:message-converters>使用
 * 在springmvc-servlet.xml中也可以配置，所以用不上
 * @author 
 * @date 
 */

@Component("JsonCustomerObjectMapper")
public class JsonCustomerObjectMapper extends ObjectMapper {

		/**
	 * 
	 */
	private static final long serialVersionUID = 4684062839496161204L;

		public JsonCustomerObjectMapper() {
//			CustomSerializerFactory factory = new CustomSerializerFactory();
//			factory.addGenericMapping(Date.class, new JsonSerializer<Date>() {
//				@Override
//				public void serialize(Date value, JsonGenerator jsonGenerator,
//						SerializerProvider provider) throws IOException, JsonProcessingException {
//					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//					jsonGenerator.writeString(sdf.format(value));
//				}
//			});
//			this.setSerializerFactory(factory);
		}
	
}
