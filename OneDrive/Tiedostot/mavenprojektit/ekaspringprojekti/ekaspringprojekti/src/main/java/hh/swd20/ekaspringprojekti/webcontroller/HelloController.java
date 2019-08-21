package hh.swd20.ekaspringprojekti.webcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@ResponseBody

public class HelloController {

	//  http://localhost:8080...
	
	@RequestMapping("*")
	public String getHello() {
		return "Hello World";
		
	}
	
	
	// http://localhost:8080/hello?etunimi=Laura
	
	@RequestMapping("/hello")
	public String getHelloName(@RequestParam (name= "etunimi")String nimi) {
		
		return "Hello " + nimi + "!";
	}
}
