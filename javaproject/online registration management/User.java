import java.io.*;
import java.util.Scanner;
public class User{
    private String id;
    private String name;
    private String phone;

    public User(){

    }
    public User(String id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void addInfo()
	{
        try{
            FileWriter fw = new FileWriter("user.txt", true);
            fw.write(id+" "+name+" "+phone+"\n");
            fw.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    public String[] getInfo(){
        String[] infoRow = new String[1000];
        int i = 0;
        try{
            File f = new File("user.txt");
            Scanner input = new Scanner(f);
            while(input.hasNextLine()){
                infoRow[i] = input.nextLine();
                i++;
            }
        }catch(IOException e){
            System.out.println("Error");
        }
        return infoRow;
    }
    
}