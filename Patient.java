public class Patient{
	public String printDetails(String hospitalName,String patientName,int age){
		return "Hospital Name :" + hospitalName + "\nPatient Name :" + patientName + "\nPatient Age :" + age;
	}
	public static void main(String[] args){
		Patient hos = new Patient();
		String details = hos.printDetails("City Care Hospital","John Doe",45);
		System.out.println(details);
		String detail = hos.printDetails("City Care Hospital","Emma Watson",30);
		System.out.println(detail);
	}
}

		