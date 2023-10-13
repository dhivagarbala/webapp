package com.oasys.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webapp {
	@GetMapping(value="/add")
public String getmessage() {
	return "success";
}
}
