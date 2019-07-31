public class Singleton 
{

 	//Create Instance
	private static final Singleton instance = new Singleton();

  	//Constructor
	private Singleton() {
	}
	
	//Getter
	public static Singleton getInstance() 
	{
		return instance;
	}
 }
 
 public class Main
 {

	public static void main(String[] args) 
  	{
      		//Get Singleton
     	 	Singleton s = Singleton.getInstance(); 
  	}
 }
