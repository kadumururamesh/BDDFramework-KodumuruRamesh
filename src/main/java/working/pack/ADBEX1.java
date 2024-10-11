package working.pack;

public class ADBEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AppiumHome -"+System.getenv("APPIUM_HOME"));
		
		System.out.println("AndroidHome -"+getAndroidHome());
		System.out.println("OPerating system -"+getOS());
		System.out.println(isWindows());
	}
	
	private static String OS;
    private static String ANDROID_HOME;

    public static String getAndroidHome(){
        if(ANDROID_HOME == null) {
            ANDROID_HOME = System.getenv("ANDROID_HOME");
            if(ANDROID_HOME == null) throw new RuntimeException("Failed to find ANDROID_HOME, make sure the environment variable is set");
        }
        return ANDROID_HOME;
    }

    public static String getOS(){
        if(OS == null) //OS = System.getenv("os.name");
        OS=System.getProperty("os.name"); 
        return OS;
    }

    public static boolean isWindows(){
        return getOS().startsWith("Windows");
    }

    public static boolean isMac(){
        return getOS().startsWith("Mac");
    }
}
