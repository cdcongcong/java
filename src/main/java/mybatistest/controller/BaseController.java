package mybatistest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class BaseController {
	//国际化
	@Autowired
    protected MessageSource messageSource;

}
