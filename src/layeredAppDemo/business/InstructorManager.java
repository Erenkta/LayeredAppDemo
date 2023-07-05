package layeredAppDemo.business;

import layeredAppDemo.core.logging.MainLogger;
import layeredAppDemo.dataAccess.CoursesDao;
import layeredAppDemo.entities.Egitmen;

public class InstructorManager {
	CoursesDao courseDao;
	MainLogger[] logs;
	
	

	public InstructorManager(CoursesDao courseDao, MainLogger[] logs) {
		super();
		this.courseDao = courseDao;
		this.logs = logs;
	}
	
	public void addInstructor(Egitmen egitmen) {
		courseDao.addInstructor(egitmen);
		for(MainLogger logger : logs) {
			logger.log(egitmen.getEgitmenName());
		}
	}
}
