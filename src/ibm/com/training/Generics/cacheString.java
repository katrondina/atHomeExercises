package ibm.com.training.Generics;

public class cacheString {
	private String message;
	
	public void add(String message){
		this.message = message;
	}
	
	public String get(){
		return message;
	}
}