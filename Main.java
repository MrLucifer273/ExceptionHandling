public class Main {

	public static void main(String[] args) {
		//create the instance of employee class and enter the value
		Address ad=new Address("102","Soyla","Paschim Medinipur","West Bengal","721146");
		Department d=new Department("ABCD_69","EE","Employee");
		Employee ep=new Employee("Ankit Sasmal",(byte)25,"7384683246",ad,"ABC_273",10000,d);
	
		 
		ep.displayemp();

	}

}