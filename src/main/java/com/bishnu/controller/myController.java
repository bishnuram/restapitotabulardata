package com.bishnu.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.bishnu.Entity.PostOffice;
import com.bishnu.Entity.ResponseDetail;


@Controller
@RequestMapping("/api")
public class myController {
@Autowired
public RestTemplate restTemplate;

@RequestMapping(value="/postofficedetail", method=RequestMethod.GET, consumes=MediaType.ALL_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
public String searchPostOffices(@RequestParam String cityName,Model model) {
	String url = "https://api.postalpincode.in/postoffice/{city}";
	url=url.replace("{city}",cityName);
		
		ResponseEntity<ResponseDetail[]> responseDetail=restTemplate.getForEntity(url, ResponseDetail[].class);
	
	ResponseDetail[] responseDetails=responseDetail.getBody();
    
    	for(ResponseDetail detail:responseDetails) {
		 List<PostOffice> postOffices= detail.getPostOffice();
 		model.addAttribute("postaldata",postOffices);
 	  	}
return "profile";

}
}