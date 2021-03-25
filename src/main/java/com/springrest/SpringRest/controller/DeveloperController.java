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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="/developers" , tags="Developer Controller")
public class DeveloperController {
	
	@Autowired
	private DeveloperService developerService;
	
	//method for getting all developers@GetMapping("/developers")
	@GetMapping("/developers")
    @ApiOperation(value = "Get all the Developers from the application ", response = Developer.class, tags = "getDevelopers")
	public List<Developer> getDevelopers(){
		return this.developerService.getDevelopers();
	}
	
	@GetMapping("/developers/{developerId}")
	@ApiOperation(value = "Get specific Developer from the application ", response = Developer.class, tags = "getDeveloper")
	public Developer getDeveloper(@PathVariable int developerId){
		return this.developerService.getDeveloper(developerId);
	}
	
	//method for adding developers
	@PostMapping("/developers")
	@ApiOperation(value = "Add a Developer into the application ", response = Developer.class, tags = "addDeveloper")
	public Developer addDeveloper(@RequestBody Developer developer){
		return this.developerService.addDeveloper(developer);
	}
	
	//method for deleting developers
	@DeleteMapping("/developers/{developerId}")
	@ApiOperation(value = "Delete a Developer from the application ", response = Developer.class, tags = "deleteDeveloper")
	public String deleteDeveloper(@PathVariable Long developerId){
		developerService.deleteDeveloper(developerId);
		return "Developer is deleted successfully.";
	}
	
	//method for updating developers
	@PutMapping("/developers/{developerId}")
	@ApiOperation(value = "Update a Developer in the application ", response = Developer.class, tags = "updateDeveloper")
	public String updateDeveloper(@RequestBody Developer developer,@PathVariable Long developerId) {
		developerService.updateDeveloper(developer,developerId);
		return "Developer is updated successfully";
	}
}
