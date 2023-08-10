import java.io.*;
import java.util.Scanner;
public class Subject{
    private String Name;
    private String Id;
    private String Time;

    public Subject(){

    }
    public Subject(String Name, String Id, String Time){
        this.Name = Name;
        this.Id = Id;
        this.Time = Time;
    }

    public void addInfo()
	{
        try{
            FileWriter fw = new FileWriter("user.txt", true);
            fw.write(Name+" "+Id+" "+Time+"\n");
            fw.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    public String[] getInfo(){
        String[] infoRows = new String[1000];
        int i = 0;
        try{
            File f = new File("user.txt");
            Scanner input = new Scanner(f);
            while(input.hasNextLine()){
                infoRows[i] = input.nextLine();
                i++;
            }
        }catch(IOException e){
            System.out.println("Error");
        }
        return infoRow;
    }
    
}