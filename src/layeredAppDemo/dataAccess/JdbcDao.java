package layeredAppDemo.dataAccess;

import layeredAppDemo.entities.Egitmen;
import layeredAppDemo.entities.Kategori;
import layeredAppDemo.entities.Kurs;

public class JdbcDao implements CoursesDao{

	@Override
	public void addCourse(Kurs kurs) {
		System.out.println("JDBC ile eklendi : " + kurs.getCourseName());

	}

	@Override
	public void addCategory(Kategori kategori) {
		System.out.println("JDBC ile eklendi : " + kategori.getCategoryName());

	}

	@Override
	public void addInstructor(Egitmen egitmen) {
		System.out.println("JDBC ile eklendi : " + egitmen.getEgitmenName());

	}
}
