package week3.HM1;


public  class Concrete implements DatabaseConnection{

	public void connect() {
		System.out.println("\t\t\t Connected Succesfully !!!\n\n");
		
	
	}

	public void disconnect() {
		System.out.println("\t\t\t DisConnected Succesfully !!!\n\n");
		
	}

	public void executeUpdata() {
		System.out.println("\t\t\t Updateed Succesfully !!!\n\n");
		
	}
	
	public static void main(String[] args) {
		//Creating object for the class 
		Concrete conobj=new Concrete ();
		
		//calling the interfaced methods
		
		conobj.connect();
		conobj.executeUpdata();
		conobj.disconnect();
	}
}
