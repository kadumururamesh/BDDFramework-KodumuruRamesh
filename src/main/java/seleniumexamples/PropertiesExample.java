package seleniumexamples;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.etsi.uri.x01903.v13.GenericTimeStampType;
import org.testng.annotations.Test;

public class PropertiesExample {
	@Test
	void ex1() throws IOException, AWTException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./src/main/resources/config.properties");
		prop.load(fis);
		System.out.println(prop.size());
		System.out.println(prop.getProperty("URL"));
		prop.setProperty("newKey", "nidish");
		
		
		Set<Entry<Object,Object>> o=prop.entrySet();
		Iterator<Entry<Object, Object>> itr=o.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		FileOutputStream fos=new FileOutputStream("./src/main/resources/config.properties");
		fos.write(0);
		
		Robot robot = new Robot();
        final Dimension screenSize = Toolkit.getDefaultToolkit().
            getScreenSize();
        System.out.println(screenSize);
        System.out.println(Toolkit.getDefaultToolkit().getScreenResolution());
       
        
		
		
	}
}
