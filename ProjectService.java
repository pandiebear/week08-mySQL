package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	
	static ProjectDao projectDao = new ProjectDao(); 
	
	

	public static Project addProject(Project project) {
		return projectDao.insertProject(project); 
	}


}
