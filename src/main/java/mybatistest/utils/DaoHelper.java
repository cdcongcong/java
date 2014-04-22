package mybatistest.utils;

import java.util.UUID;

public class DaoHelper {
	public static String getUUID(){
		UUID uuid = UUID.randomUUID(); 
		return uuid.toString().replace("-", "");
	}

}
