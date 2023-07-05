package layeredAppDemo;

import layeredAppDemo.business.CategoryManager;
import layeredAppDemo.business.CourseManager;
import layeredAppDemo.business.InstructorManager;
import layeredAppDemo.core.logging.DatabaseLogger;
import layeredAppDemo.core.logging.EmailLogger;
import layeredAppDemo.core.logging.FileLogger;
import layeredAppDemo.core.logging.MainLogger;
import layeredAppDemo.dataAccess.HibernateDao;
import layeredAppDemo.dataAccess.JdbcDao;
import layeredAppDemo.entities.Egitmen;
import layeredAppDemo.entities.Kategori;
import layeredAppDemo.entities.Kurs;
import layeredAppDemo.utils.KursUtils;

public class Main {

	public static void main(String[] args) throws Exception {
		//Instructor
		MainLogger[] instructorLogger = {new EmailLogger(),new FileLogger()};
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(),instructorLogger);
		
		Egitmen egitmen1 = new Egitmen();
		egitmen1.setEgitmenId(1);
		egitmen1.setEgitmenName("Eren");
		instructorManager.addInstructor(egitmen1);
		
		System.out.println("-----   -----   -----   -----");
		//Course
		MainLogger[] courseLogger = {new FileLogger()};
		CourseManager courseManager = new CourseManager(courseLogger,new JdbcDao());
		
		Kurs kurs1 = new Kurs(1,"Java",200);
		courseManager.addCourse(kurs1);
	
		System.out.println("-----   -----   -----   -----");
		//Category
		MainLogger[] categoryLogger = {new DatabaseLogger(),new FileLogger()};
		CategoryManager categoryManager = new CategoryManager(new JdbcDao(),categoryLogger);
		
		Kategori kategori1 = new Kategori(101,"Programlama");
		categoryManager.addCategory(kategori1);
		

	}

}
