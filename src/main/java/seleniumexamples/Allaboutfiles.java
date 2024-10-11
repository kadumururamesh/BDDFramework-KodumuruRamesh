package seleniumexamples;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class Allaboutfiles {
	@Test
	void filesex1() throws IOException {
	
	//File f=new File("nidish.pdf");
		File f=new File("ramesh", "nidish.txt");
	f.mkdir();
	f.createNewFile();
	//System.out.println(f.exists());
	
	}

}
