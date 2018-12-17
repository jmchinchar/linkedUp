package com.tts.LinkedUp.Post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.tts.LinkedUp.User.User;

@Entity
public class Post {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;	
  
  @NotNull
  @ManyToOne
  @JoinColumn(name="user_id")
  private User user;

  private String entry;


  public Post() {
	
	}


	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public User getUser() {
		return user;
	}
	
	
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public String getEntry() {
		return entry;
	}
	
	
	public void setEntry(String entry) {
		this.entry = entry;
	}
	  
  

}
