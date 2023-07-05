package layeredAppDemo.business;

import java.util.ArrayList;

import layeredAppDemo.core.logging.MainLogger;
import layeredAppDemo.dataAccess.CoursesDao;
import layeredAppDemo.entities.Kategori;
import layeredAppDemo.utils.KursUtils;

public class CategoryManager {
	ArrayList<Kategori> categories = new ArrayList<Kategori>();
	CoursesDao coursesDao;
	MainLogger[] logs;
	


	public CategoryManager(CoursesDao coursesDao, MainLogger[] logs) {
		super();
		this.coursesDao = coursesDao;
		this.logs = logs;
	}
	
	public void addCategory(Kategori kategori) throws Exception {
		KursUtils utils = new KursUtils();
		boolean state1 = utils.isDuplicateCategoryName(kategori, categories);
		if(state1) {
			categories.add(kategori);
			coursesDao.addCategory(kategori);
			for(MainLogger logger : logs) {
				logger.log(kategori.getCategoryName());
			}
		}

	}
	
	
}
