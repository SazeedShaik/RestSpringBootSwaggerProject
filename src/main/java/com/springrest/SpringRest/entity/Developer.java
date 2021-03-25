package com.springrest.SpringRest.entity;
import io.swagger.annotations.ApiModelProperty;

public class Developer {
	
	@ApiModelProperty
	private Long id;
	@ApiModelProperty
	private String name;
	@ApiModelProperty
	private String skills;
	
	public Developer(Long id, String name, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", skills=" + skills + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSkills()=" + getSkills() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
