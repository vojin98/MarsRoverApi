package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverApiTest {

	@Test
	public void smallTest()
	{
		
RestTemplate  rp = new RestTemplate();	

 ResponseEntity<MarsRoverApiResponse> response = rp.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY\r\n", MarsRoverApiResponse.class);

   System.out.println(response.getBody());


	}
	
}
