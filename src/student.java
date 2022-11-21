import java.util.ArrayList;
import java.util.Scanner;

public class student {
    String name;
    String adno;
    int rollno;
    String clg;

    public student(String name, String adno, int rollno, String clg) {
        this.name = name;
        this.adno = adno;
        this.rollno = rollno;
        this.clg = clg;
    }
    public static void main(String args[]){
        ArrayList<student> stud=new ArrayList<student>();
        while (true){
            System.out.println("Select the options\n");
            Scanner sc=new Scanner(System.in);
            System.out.println("1.Add Student\n2.View Student\n3.Search Student\n4.Delete Student\n5.Exit");
            int men= sc.nextInt();
            switch (men){
                case 1:
                    System.out.println("Enter Name of student");
                    String name= sc.next();
                    System.out.println("Enter Roll Number");
                    int roll= sc.nextInt();
                    System.out.println("Enter admission number");
                    String ad= sc.next();
                    System.out.println("Enter Name of college");
                    String clg=sc.next();

                    student st=new student(name,ad,roll,clg);
                    stud.add(st);
                    break;
                case 2:
                    for (student s1:stud){
                        System.out.println(s1.name);
                        System.out.println(s1.adno);
                        System.out.println(s1.rollno);
                        System.out.println(s1.clg);
                    }
                    break;

            }
        }
    }
}
