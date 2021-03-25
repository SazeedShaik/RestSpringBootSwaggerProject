package com.springrest.SpringRest.services;
import java.util.List;
import com.springrest.SpringRest.entity.Developer;

public interface DeveloperService {
	public List<Developer> getDevelopers();
	public Developer getDeveloper(int developerId);
	public Developer addDeveloper(Developer developer);
	public void deleteDeveloper(Long developerId);
	public void updateDeveloper(Developer developer, Long developerId);
}
