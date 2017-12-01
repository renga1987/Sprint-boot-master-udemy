package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {

	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean(){
				
		SomeBean someBean = new SomeBean("v1","v2","v3");
		
		MappingJacksonValue mjv = new MappingJacksonValue(someBean);

		return someBean;
	}
}
