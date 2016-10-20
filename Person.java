public class Person {
	
	/**
	**  Any  role in CRM project would need to be an  instance  of class Person
	**/

	// define attributes & methods here
	String s_name ;
	
	public String getName() {      // REVIEW  : Please add  setter method for attribute Name
		return  s_name ;
	}
	public  void setName(String n)  {
		s_name = new  String(n) ;
	}
}
