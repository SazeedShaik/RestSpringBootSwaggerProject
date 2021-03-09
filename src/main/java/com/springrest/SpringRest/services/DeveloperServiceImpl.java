package com.springrest.SpringRest.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.entity.Developer;

@Service
public class DeveloperServiceImpl implements DeveloperService {
	
	List<Developer> list;
	
	public DeveloperServiceImpl() {
		list= new ArrayList();
		list.add(new Developer((long) 1, "Developer1", "Java, SpringBoot"));
		list.add(new Developer((long) 2, "Developer2", "Java, SpringBoot, REST, AWS"));
		list.add(new Developer((long) 3, "Developer3", "Java, SpringBoot, REST"));
	}
	
	@Override
	public List<Developer> getDevelopers(){
		return list;
	}

	//method for getting all developers
	@Override
	public Developer getDeveloper(int developerId) {
		Developer d=null;
		for(Developer developer: list) {
			if(developer.getId()==developerId)
			{
				d=developer;
			    break;
			}
		}
		return d;
	}
	

	//method for adding developers
	@Override
	public Developer addDeveloper(Developer developer) {
		list.add(developer);
		return developer;
	}
	

	//method for deleting developers
	@Override
	public void deleteDeveloper(Long developerId) {
		this.list.removeIf(list -> list.getId().equals(developerId));
	}
	

	//method for updating developers
	@Override
	public void updateDeveloper(Developer developer, Long developerId) {
		for(Developer dev: list) {
			if(dev.getId()==developerId)
			{
			dev.setId(developer.getId());
			dev.setName(developer.getName());
			dev.setSkills(developer.getSkills());
			}
			
		}
		
	}
		

}
