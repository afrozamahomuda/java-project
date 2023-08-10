import java.io.*;

public class Course
{
	private String courseInfo;
	private String courseId;
	public Course(){

	}
	public Course(String courseId){
		this.courseId = courseId;
	}
	public String getCourse(){
		courseInfo = " ";
		if(courseId.equals("1")){
			courseInfo = "1 OOP-1 2210 11:00";
		}else if(courseId.equals("2")){
			courseInfo = "2 Physics-1 2211 12:00";
		}else if(courseId.equals("3")){
			courseInfo = "3 Physics-2 2212 1:00";
		}else if(courseId.equals("4")){
			courseInfo = "4 Chemistry-1 2213 2:00";
		}else if(courseId.equals("5")){
			courseInfo = "5 Chemistry-2 2214 11:00";
		}else if(courseId.equals("6")){
			courseInfo = "6 Discrete-Math 2215 9:30";
		}else if(courseId.equals("7")){
			courseInfo = "7 English-Speaking 2216 2:00";
		}else if(courseId.equals("8")){
			courseInfo = "8 Math-1 2217 12:00";
		}else if(courseId.equals("9")){
			courseInfo = "9 Math-2 2218 1:00";
		}else if(courseId.equals("10")){
			courseInfo = "10 Data-Structure 2219 10:00";
		}
		return courseInfo;
	}
	public static void main(String[] args)
	{
		Course c1=new Course("1");
		System.out.println(c1.getCourse());	
	}
}