package org.sid.dto;

import java.net.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryDTO {
	
	private int id;
    private String node_id;
    private String name;
    private String full_name;
    private String description;
    private URL html_url;
    private String language;
    
    
	public RepositoryDTO() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNode_id() {
		return node_id;
	}


	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFull_name() {
		return full_name;
	}


	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public URL getHtml_url() {
		return html_url;
	}


	public void setHtml_url(URL html_url) {
		this.html_url = html_url;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}
	
	


	
	  
}
