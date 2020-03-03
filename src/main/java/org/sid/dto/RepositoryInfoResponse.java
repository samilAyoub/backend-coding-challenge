package org.sid.dto;

import java.util.List;

import org.sid.dto.RepositoryDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepositoryInfoResponse {

	public RepositoryInfoResponse() {
		// TODO Auto-generated constructor stub
	}
	
	@JsonProperty("items")
	private List<RepositoryDTO> repositoryDTOs;

	public List<RepositoryDTO> getRepositoryDTOs() {
		return repositoryDTOs;
	}

	public void setRepositoryDTOs(List<RepositoryDTO> repositoryDTOs) {
		this.repositoryDTOs = repositoryDTOs;
	}

}
