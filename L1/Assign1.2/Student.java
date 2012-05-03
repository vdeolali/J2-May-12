package MySchool.Admissions;


public class Student{
    private    String   firstName;
    private    String   lastName;
    private    int      studentID;
    private    String[] courseIDsEnrolled;

    public Student (){
	this.firstName = "";
	this.lastName = "";
	this.studentID = 0;
    }

    public Student(int StudentID, String firstName, String lastName, String[] courseIDsEnrolled){
	this.studentID = StudentID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.courseIDsEnrolled = courseIDsEnrolled;
    }

    public String concatName (){
	return (this.firstName+this.lastName);
    }

    public int getStudentID (){
	return (this.studentID);
    }

    public void setStudentID (int studentID){
	this.studentID = studentID;
    }

    public String getFirstName () {
	return (this.firstName);
    }

    public void setFirstName (String firstName){
	this.firstName = firstName;
    }

    public String getLastName () {
	return (this.lastName);
    }

    public void setLastName (String lastName){
	this.lastName = lastName;
    }

    public String[] getCourseIDsEnrolled (){
	return (this.courseIDsEnrolled);
    }

    public void   setCourseIDsEnrolled (String[] courseIDsEnrolled){
	this.courseIDsEnrolled = courseIDsEnrolled;
    }
}