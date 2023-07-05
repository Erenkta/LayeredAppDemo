package layeredAppDemo.utils;

import java.util.ArrayList;

import layeredAppDemo.entities.Kategori;
import layeredAppDemo.entities.Kurs;

public class KursUtils {
	
	//Kurs ismi tekrar edemez
	public boolean isDuplicateCourseName(Kurs kurs,ArrayList<Kurs> courses) throws Exception {
		for(Kurs c : courses) {
			if(c.getCourseName() == kurs.getCourseName()) {
				throw new Exception("Course name cannot duplicate ! ");
			}
		}
		return true;
	}
	
	//Kategori ismi tekrar edemez
	public boolean isDuplicateCategoryName(Kategori kategori,ArrayList<Kategori> categories) throws Exception {
		for(Kategori k : categories) {
			if(k.getCategoryName() == kategori.getCategoryName()) {
				throw new Exception("Category name cannot duplicate ! ");
			}
		}
		return true;
	}
	
	//Kurs fiyatı 0'dan küçük olamaz
	public boolean isLowerThanZero(Kurs kurs) throws Exception{
		if(kurs.getCoursePrice() <= 0) {
			throw new Exception("Course Price cannot lower than zero ! ");
		}
		else {
			return true;
		}
	}
	
}
