package com.tts.LinkedUp.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String currentJob;
	private String interests;
	private String github;
	private String workHistory;
	private String skills;
	
	public User() {
		//Needed for JPA
	}
	
	public User(Long id, String firstName, String lastName, String currentJob, String interests, String github,
			String workHistory, String skills) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentJob = currentJob;
		this.interests = interests;
		this.github = github;
		this.workHistory = workHistory;
		this.skills = skills;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCurrentJob() {
		return currentJob;
	}
	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public String getGithub() {
		return github;
	}
	public void setGithub(String github) {
		this.github = github;
	}
	public String getWorkHistory() {
		return workHistory;
	}
	public void setWorkHistory(String workHistory) {
		this.workHistory = workHistory;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", currentJob=" + currentJob
				+ ", interests=" + interests + ", github=" + github + ", workHistory=" + workHistory + ", skills="
				+ skills + "]";
	}
	
	
	
	

}
