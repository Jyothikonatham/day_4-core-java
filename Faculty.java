public class Faculty{
	public String showFacultyDetails(String universityName,String facultyName,String department){
		return "University Name :" + universityName +"\nFaculty Name :" + facultyName +"\nDepartment :" + department;
	}
	public static void main(String[] args){
		Faculty fac = new Faculty();
		String det = fac.showFacultyDetails("Stanford University","Dr. Robert Brown","Computer Science");
		System.out.println(det);
		String deta = fac.showFacultyDetails("Stanford University","Dr. Lisa Green","Physics");
		System.out.println(deta);
	}
}

