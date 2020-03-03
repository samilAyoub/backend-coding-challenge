package org.sid.service;


import java.util.ArrayList;
import java.util.List;

import org.sid.dto.RepositoryDTO;
import org.sid.dto.RepositoryInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitServiceImp {

	@Autowired
	private RestTemplate restTemplate;
	
	private RepositoryInfoResponse repositoryInfoResponse;
	
	@Value("${tasks}") 
	private String resource;
	
	//Fetching 100 trending repositories 
	public List<RepositoryDTO> findTrendRep() {
		repositoryInfoResponse = restTemplate.getForObject(resource,RepositoryInfoResponse.class);
		List<RepositoryDTO> response=repositoryInfoResponse.getRepositoryDTOs();
		return response;
		
		  }
	
	//Number of repositories by language
	public int getNumberRepo(String language) {
		int count=0;
		List<RepositoryDTO> listRep;
		listRep=findTrendRep();
		for(RepositoryDTO rep:listRep) {
			if(rep.getLanguage()!=null && rep.getLanguage().equals(language))
				count++;
		}
		return count;
	}
	
	//list of repositories using by language
	public List<RepositoryDTO> getRepoByLanguage(String language){
		List<RepositoryDTO> listRep;
		List<RepositoryDTO> subList=new ArrayList<>();
		listRep=findTrendRep();
		for(RepositoryDTO rep:listRep) {
			if(rep.getLanguage()!=null && rep.getLanguage().equals(language))
				subList.add(rep);
		}
		return subList;
		
	}
	
	
	
	
	

}
