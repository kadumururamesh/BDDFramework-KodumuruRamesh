package seleniumexamples;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class DownloadFileExample {
	@Test
	void ex1() throws IOException {
		
		String downloadexefilepath=System.getProperty("user.dir")+"//src//main//resources//AutoIt//AutoItScripts//DownloadFilewithargs.exe";
		String filepath=System.getProperty("user.dir")+"\\src\\main\\resources\\AutoIt\\File_Download\\ramesh.txt";
		String urllink="https://the-internet.herokuapp.com/download/interviewquestions.txt";
						 
		Runtime.getRuntime().exec(downloadexefilepath +" "+urllink+" "+filepath);
		
	}

}
