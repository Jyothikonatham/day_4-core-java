public class Enrollment{
	public String getEnrollmentInfo(String platform,String course,String student){
		return "platform :" + platform + "\nCourse :" + course + "\nStudent :" + student;
	}
	public static void main(String[] args){
		Enrollment enr = new Enrollment();
		String det = enr.getEnrollmentInfo("Udemy","Java Programming","Alice");
		System.out.println(det);
		String det1= enr.getEnrollmentInfo("Udemy","Web Development","Bob");
		System.out.println(det1);
	}
}