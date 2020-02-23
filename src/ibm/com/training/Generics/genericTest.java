package ibm.com.training.Generics;

public class genericTest {

	public static void main(String[] args) {
		cacheString myMessage = new cacheString(); //Type
		cacheShirt myShirt = new cacheShirt();     //TYpe
		
		//Generics
		cacheAny<String> myGenericMessage = new cacheAny<String>();
		cacheAny<String> myGenericShirt = new cacheAny<String>();
		
		myMessage.add("save this for me");
		myGenericMessage.add("save this for me");
		myShirt.add("hello this is my shirt");
		myGenericShirt.add("henlo this is my generic shirt");
	}

}
