
public class Main {

	public static void main(String[] args) {
		
		Course cSharp = new Course(1,"C#+Angular","Kamp�m�z 2 ay surecek.","Engin Demirog","50");
		Course java = new Course(2,"Java+React","Kamp�m�z 2 ay surecek.","Engin Demirog","0");
		
		CourseManager myCourseManager = new CourseManager();
		myCourseManager.addToMyCourses(java);
		myCourseManager.addToMyCourses(cSharp);
		
		myCourseManager.showMyCourses();
	}

}
