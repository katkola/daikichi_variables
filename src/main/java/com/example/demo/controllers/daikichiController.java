package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class daikichiController {

	@GetMapping("/")
	public String index() {
		return "Welcome";
	}
	
	 @GetMapping("/daikichi/travel/{destination}")
	    public String travelPlanner(@PathVariable("destination") String destination){
	    	return "Congratulations! You will soon travel to "+ destination +"!";
	    }
	 @RequestMapping("/daikichi/lotto/{lot_num}")
	    public String lottoNumbers(@PathVariable("lot_num") String lot_num){
		 	int lottoInt = Integer.parseInt(lot_num);
		 	String output = "";
		 	if(lottoInt%2==0) {
		 		output = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		 	}
		 	else {
		 		output="You will take a grand journey in the near future, but be weary of tempting offers";
		 	}
	    	return output;
	    }
}
