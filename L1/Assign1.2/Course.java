package MySchool.Departments.ComputerScience;

public class Course{

    String  courseId;
    String  courseTitle;
    int     creditHours;

    public Course (){
	courseId = "";
	courseTitle = "";
	creditHours = 0;
    }

    public Course (String courseId, String courseTitle, int creditHours){
	System.out.println ("Created Object\n");
	this.courseId = courseId;
	this.courseTitle = courseTitle;
	this.creditHours = creditHours;
	printCourse();
    }

    public void printCourse (){
	System.out.println (courseId + "\t" + courseTitle + "\t\t" + creditHours +"\n");
    }

	public String getCourseId (){
		return courseId;
	}


	public String getCourseTitle (){
		return courseTitle;
	}

	public int getCreditHours (){
		return creditHours;
	}


	public void setCourseId (String courseId){
		this.courseId= courseId;
	}


	public void setCourseTitle (String courseTitle){
		this.courseTitle = courseTitle;
	}

	public void setCreditHours (int creditHours){
		this.creditHours = creditHours;
	}
}