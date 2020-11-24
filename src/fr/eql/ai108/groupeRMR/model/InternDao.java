package fr.eql.ai108.groupeRMR.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;


public class InternDao {
	
	private File file = new File("annuaire.bin");

	public List<Intern> getAll() {
		List<Intern> interns = new ArrayList<Intern>();
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(file, "rw");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return interns;
	}

}
