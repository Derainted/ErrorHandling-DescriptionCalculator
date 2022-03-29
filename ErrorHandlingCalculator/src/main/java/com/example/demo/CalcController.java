package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController implements ErrorController {

	CalcService calc = new CalcService();

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public String root() {
		String result = "";
		result += "<html><head><title>Calculator</title></head>";
		result += "<body>";
		result += "<h2>Calculator Project Documentation</h2>";

		result += "</body></html>";
		return result;
	}

	@CrossOrigin
	@RequestMapping(value = "/calc", method = RequestMethod.GET)
	public String calc(String n1, String n2, String op) {
		return calc.calculator(n1, n2, op);
	}

	@CrossOrigin
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String errorHander() {
		return "Please Re-enter URL " + "\r\n " + root();
	}
}
