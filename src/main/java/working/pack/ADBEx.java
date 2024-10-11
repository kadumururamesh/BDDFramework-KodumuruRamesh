package working.pack;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ADBEx {
	 private static final String NEWLINE = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
			  
		ProcessBuilder pb = new ProcessBuilder("java -version").redirectErrorStream(true);
        Process process = pb.start();
        StringBuilder result = new StringBuilder(80);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream())))
        {
            while (true)
            {
                String line = in.readLine();
                if (line == null)
                    break;
                result.append(line).append(NEWLINE);
            }
        }
        System.out.println(result.toString());
	   
	}

}
