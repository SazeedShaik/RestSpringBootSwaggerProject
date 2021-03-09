package com.springrest.SpringRest.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.SpringRest.entity.Developer;
import com.springrest.SpringRest.services.DeveloperService;

@RestController
public class MainController {
	
	@GetMapping("/home")
	public String home() {
		return "This is home";
	}
	
	@Autowired
	private DeveloperService developerService;
	
	
	@GetMapping("/developers")
	public List<Developer> getDevelopers(){
		return this.developerService.getDevelopers();
		
	}
	
	@GetMapping("/developers/{developerId}")
	public Developer getDeveloper(@PathVariable int developerId){
		return this.developerService.getDeveloper(developerId);
	}
	
	@PostMapping("/developers")
	public Developer addDeveloper(@RequestBody Developer developer){
		return this.developerService.addDeveloper(developer);
	}
	
	@DeleteMapping("/developers/{developerId}")
	public String deleteDeveloper(@PathVariable Long developerId){
		developerService.deleteDeveloper(developerId);
		return "Developer is deleted successfully.";
	}
	
	@PutMapping("/developers/{developerId}")
	public String updateDeveloper(@RequestBody Developer developer,@PathVariable Long developerId) {
		developerService.updateDeveloper(developer,developerId);
		return "Developer is updated successfully";
		
	}

}
