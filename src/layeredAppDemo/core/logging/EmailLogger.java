package layeredAppDemo.core.logging;



public class EmailLogger implements MainLogger {

	@Override
	public void log(String data) {
		System.out.println("Email'e Loglandı : " + data);
		
	}

}
