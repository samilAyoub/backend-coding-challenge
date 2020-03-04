package org.sid.web;

import org.sid.dto.RepositoryDTO;
import org.sid.service.GitServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;;

@RestController
@RequestMapping("/api")
public class GithubController {
	@Autowired
	private GitServiceImp gitServiceImp;

	@GetMapping("/trendRep")
	public List<RepositoryDTO> getAllRep() {
		return gitServiceImp.findTrendRep();
		
	}
	
	@GetMapping("/trendRep/nbr/searchByLang")
	public int getNbrRepByLang(@RequestParam("lg") String param) {
		return gitServiceImp.getNumberRepo(param);
	} 
	
	@GetMapping("/trendRep/fetch/searchByLang")
	public List<RepositoryDTO> getRepBylang(@RequestParam("lg") String param){
		return gitServiceImp.getRepoByLanguage(param);
	}
	
	

}
