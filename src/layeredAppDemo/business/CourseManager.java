package layeredAppDemo.business;

import java.lang.System.Logger;
import java.util.ArrayList;

import layeredAppDemo.core.logging.MainLogger;
import layeredAppDemo.dataAccess.CoursesDao;
import layeredAppDemo.entities.Kurs;
import layeredAppDemo.utils.KursUtils;

public class CourseManager {
	ArrayList<Kurs> courses = new ArrayList<Kurs>();
	MainLogger[] logs;
	CoursesDao courseDao;
	KursUtils kursUtils = new KursUtils();

	public CourseManager(MainLogger[] logs, CoursesDao courseDao) {
		super();
		this.courseDao = courseDao;
		this.logs = logs;
	}

	public void addCourse(Kurs kurs) throws Exception {
		boolean state1 = kursUtils.isLowerThanZero(kurs);
		boolean state2 = kursUtils.isDuplicateCourseName(kurs, courses);

		if (state1 && state2) {
			courses.add(kurs);
			// db
			courseDao.addCourse(kurs);
			//
			for (MainLogger logger : logs) {
				logger.log(kurs.getCourseName());
			}
		} 
	}

}
