import java.util.ArrayList;
import java.util.Scanner;

public class student {
    String name;
    int adno;
    int rollno;
    String clg;

    public student(String name, int adno, int rollno, String clg) {
        this.name = name;
        this.adno = adno;
        this.rollno = rollno;
        this.clg = clg;
    }
    public static void main(String args[]){
        ArrayList<student> emplist=new ArrayList<student>();
        while (true){
            System.out.println("Select the options\n");
            Scanner sc=new Scanner(System.in);
            System.out.println("1.Add Student\n2.View Student\n3.Search Student\n4.Delete Student\n5.Exit");
            int men= sc.nextInt();
        }
    }
}
