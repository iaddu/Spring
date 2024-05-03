package springmvcsearch;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlingExpcetion {
	
	@ExceptionHandler(value=NullPointerException.class)
	public String HandleNullException(){
		return "null_error";
	}
}
