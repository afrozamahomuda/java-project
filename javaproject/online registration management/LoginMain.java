import java.io.*;
import java.util.Scanner;

public class LoginMain {

public static void main(String[] args) {
  Course[] courses=new Course[5];
  String Username;
  String Password;
  int action;
   
    Scanner input1 = new Scanner(System.in);
    System.out.println("**");
    System.out.println("**");
	System.out.println("Welcome to student login System");
    System.out.println("**1.Student   Registration"+"**      ");
    System.out.println("**2.Admin Panel"+"**  ");
    System.out.println("**3.Faculty Information**");
 
	while(true)
	{
	System.out.println("Select Your Action");
    action=input1.nextInt();
    if (action==2){

    System.out.println("Welcome to registration System");

    Password = "admin";
    Username = "admin";


    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)){

        System.out.println("Access Granted! Welcome!");
		
        while(true){
            System.out.println("Option-1: add Student");
            System.out.println("Option-2: show Student");
            System.out.println("Option-3: exit");
			
            System.out.print("Option: ");
            Scanner opt = new Scanner(System.in);
            int k = opt.nextInt();
            if(k == 1){
                System.out.println("Add Student--------------");
                Scanner infoInput = new Scanner(System.in);
                System.out.print("Id: ");
                String id = infoInput.nextLine();
                System.out.print("Name: ");
                String name = infoInput.nextLine();
                System.out.print("Email: ");
                String email = infoInput.nextLine();

                User student = new User(id, name, email);
                student.addInfo();
            }else if(k == 2){
                System.out.println("Student Info-----------------");
                User u = new User();
                String[] info = u.getInfo();
                for(int i=0; info[i] != null; i++){
                    System.out.println(info[i]);
                }
                //select particular student to show its info row
                System.out.print("Enter Option: ");
                Scanner getId = new Scanner(System.in);
                int n = getId.nextInt();

                try{
                    File f = new File(Integer.toString(n)+".txt");
                    if(f.exists()){
                        Scanner fileInput = new Scanner(f);
                        while(fileInput.hasNextLine()){
                            System.out.println(fileInput.nextLine());
                        }
                    }
                }catch(Exception e){
                    System.out.println("An error occurs");
                }

            }else if(k == 3){
                break;
            }else{
                System.out.println("You have put wrong option");
            }
		}
    }else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    }else if(password.equals(Password)) {
        System.out.println("Invalid Username!");
    }else{
        System.out.println("Invalid Username & Password!");
    }


    }

    else if (action==3)
    {
        TeacherDemo teachers[]=new TeacherDemo[5];
        teachers[0]=new TeacherDemo("Rabiul Alam","java");
        teachers[1]=new TeacherDemo("John","physics");
        teachers[2]=new TeacherDemo("Bob","Math");
        teachers[3]=new TeacherDemo("Stark","Discrete Math");
        teachers[4]=new TeacherDemo("Sanity","Introduction to Computer");
    for(int i=0;i<teachers.length;i++)
	{
		System.out.println("      Name     =>    "+teachers[i].name+"  Subject  =>  "+teachers[i].subject);
	}
	}
    else if (action==1)
    {
        int h;
        System.out.println("option-1: course registration");
        System.out.println("option-2: show courses");
        System.out.println("option-3: Exit");
	    Scanner s=new Scanner(System.in);
	    System.out.println("Choose an option: ");
	    h=s.nextInt();
	
	//logged in
	//get a new student id
	//Student should have 2 options 1. course registration 2. show courses
    System.out.println("Welcome back to student login System");

    if(h==1){
        Scanner stdInput = new Scanner(System.in);
        System.out.println("Enter Student ID : ");
        String studentId = stdInput.next();

        try{
            System.out.println("Add courses-----------------");
            Scanner getId = new Scanner(System.in);
            String[] courseInfo = new String[5];
            FileWriter fw = new FileWriter(studentId+".txt");

            for(int m=0; m<5; m++){
                System.out.print("Enter your course option: ");
                int i = getId.nextInt();
                Course c = new Course(Integer.toString(i));
                courseInfo[m] = c.getCourse();  //adding value in array
                fw.write(courseInfo[m]+"\n");    //adding courses in particular student id file
            }
        }catch(Exception e){
            System.out.println("An error occurs");
        }
        
        
        
		  
	}else if(h==2){
	    for(int m=1; m<=10; m++){
            Course c = new Course(Integer.toString(m));
            System.out.println(c.getCourse());
        }
	
	
    //File f=new File();
    //f.createNewFile(studentId+".txt");

	for(int i=0;i<5;i++)
	{
        Scanner l=new Scanner(System.in); 
        String id;
        String course;
        String time;
        id=l.nextLine();
        course=l.nextLine();
        time=l.nextLine();
	//will add courses	
	}
    }
        else
        {
       
        }
    }
	}
    }
}