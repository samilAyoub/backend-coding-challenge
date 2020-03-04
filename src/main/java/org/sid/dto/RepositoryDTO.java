package org.sid.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryDTO {
	

    private String language;
    
    
	public RepositoryDTO() {
		super();
	}


	


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}
	
	


	
	  
}
