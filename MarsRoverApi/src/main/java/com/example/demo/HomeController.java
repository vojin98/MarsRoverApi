package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import com.repository.PreferencesRepository;

@Controller
public class HomeController {
	  
	
	
	@Autowired
	private PreferencesRepository preferencesRepository;
	@Autowired
	private MarsRoverApiService roverService;
	
	@GetMapping("/")
	public String getHomeView(ModelMap model, Long userId)
	{
		
		
		HomeDto homeDto = new HomeDto();
		homeDto.setMarsApiRoverData("opportunity");
		homeDto.setMarsSol(1);

		if(userId == null)
		{
			homeDto = roverService.save(homeDto);
		}
		else {
		 homeDto = roverService.findByUserId(userId);
		}
		 MarsRoverApiResponse roverData = roverService.getRoverData(homeDto);
		 model.put("roverData",roverData);
		 model.put("homeDtc",homeDto);
		 model.put("validCameras", roverService.getValidCameras().get(homeDto.getMarsApiRoverData()));
		return "index";
		
	}
	
	@PostMapping("/")
	public String postHomeView(HomeDto homeDto)
	{
 homeDto = roverService.save(homeDto);
		return "redirect/?userId=" + homeDto.getUserId();
		
	}

}
