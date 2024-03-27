package working.pack;

public class ReWeb extends Intdriver implements Web1{

	@Override
	public void m1() {
		System.out.println("m1" +driver);
		
	}

	@Override
	public void m2() {
		System.out.println("m2" +driver);	
		m4();}
	

	@Override
	public void m3(String name) {
		System.out.println("m3" +driver);
		System.out.println("name is" +name);
	}
	
	public void m4() {
		System.out.println("m4" +driver);	
	}

}
