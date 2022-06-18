package com.example.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {
  
	private Map <String, List <String>> validCameras = new HashMap<>();
	
	public MarsRoverApiService()
	{
		validCameras.put("opportunity",Arrays.asList("FHAZ","RHAZ","NAVCAM","PANCAM","MINITIES"));
		validCameras.put("curiosity",Arrays.asList("FHAZ","RHAZ","MAST","CHECM","MAHLI","MARDI","NAVCAM"));
		validCameras.put("spirit",Arrays.asList("FHAZ","RHAZ","NAVCAM","PANCAM","MINITIES"));


	}
	
	public MarsRoverApiResponse getRoverData(HomeDto homeDto)
	{
		
		RestTemplate rt = new RestTemplate();
		
		List<String> apiUrlEndpoints = getUrlApiEndpoints(homeDto);
		
		List<MarsPhoto> photos = new ArrayList<>();
		
		MarsRoverApiResponse response = new MarsRoverApiResponse();
		
		apiUrlEndpoints.stream()
.forEach(url-> {
MarsRoverApiResponse apiResponse = rt.getForObject(url, MarsRoverApiResponse.class);

		photos.addAll(apiResponse.getPhotos());
	});
		
		photos.setPhotos(photos);
		return response ;
		
	}
	
	public List<String> getUrlApiEndpoints(HomeDto homeDto) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		List<String> urls = new ArrayList<>();
		Method [] methods = homeDto.getClass().getMethods();
		
		for(Method method :methods)
		{
			
			if(method.getName().indexOf("getCamera") > -1 && Boolean.TRUE.equals(method.invoke(homeDto)))
		
			{
				
			String cameraName = 	method.getName().split("getCamera")[1].toUpperCase();
			if(validCameras.get(homeDto.getMarsApiRoverData()).contains(cameraName))
					
			{
				urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=DEMO_KEY\r\n" +"&camera="+cameraName);

			}
				
			}
		}
	  return urls;
	}
	
	public Map<String,List <String>> getValidCameras()
	{
		
		return validCameras;
	}

	public HomeDto save(HomeDto homeDto) {
		return preferencesRepository.save(homeDto);
		
	}

	public void findByUserId() {
		// TODO Auto-generated method stub
	HomeDto marsApiPreferences=	preferencesRepository.findByUserId(userId);
	}
}
