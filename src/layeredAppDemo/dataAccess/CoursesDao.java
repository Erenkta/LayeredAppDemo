package layeredAppDemo.dataAccess;

import layeredAppDemo.entities.Egitmen;
import layeredAppDemo.entities.Kategori;
import layeredAppDemo.entities.Kurs;

public interface CoursesDao {
	public void addCourse(Kurs kurs);
	public void addCategory(Kategori kategori);
	public void addInstructor(Egitmen egitmen);
}
