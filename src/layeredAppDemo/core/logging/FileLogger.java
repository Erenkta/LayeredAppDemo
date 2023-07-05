package layeredAppDemo.core.logging;



public class FileLogger implements MainLogger {

	@Override
	public void log(String data) {
		System.out.println("File'e Loglandı : " + data);
		
	}

}
