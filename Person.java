public class Person {
	
	/**
	**  Any  role in CRM project would need to be an  instance  of class Person
	**/

	// define attributes & methods here
	String name ;
	
	public String getName() {      // REVIEW  : Please add  setter method for attribute Name
		return  name ;
	}
	public  void setName(String n)  {
		name = new  String(n) ;
	}
}
