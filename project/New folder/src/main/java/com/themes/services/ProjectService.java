package com.themes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.themes.models.Project;
import com.themes.models.ProjectAddressDetails;
import com.themes.models.ProjectServiceDetails;

@Service
public interface ProjectService {

	public Project createProject(Project project);
	
	
	public Project getProjet(Integer projectId);
	
	
	public ProjectAddressDetails getProjectAddress(Integer projectId);
	
	public List<ProjectServiceDetails> getProjectService(Integer projectId);
	
	
}
