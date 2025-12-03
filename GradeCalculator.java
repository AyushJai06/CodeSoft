import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number of subjects:");
         int num=sc.nextInt();
        double total_marks=0;
        double avg=0;
        int mrk[]=new int[num];
        String subs []=new String[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter subject "+(i+1)+"(please use only 3 letters) :");
            sc.nextLine();
            subs[i]=sc.nextLine();
            System.out.print("Enter marks(out of 100):");
            mrk[i]=sc.nextInt();
            total_marks+=mrk[i];

        }
        double percent=total_marks/num;
        String grade;
        if(percent>=90){
            grade="A";
        }
        else if(percent>=80){
            grade="B";
        }
        else if(percent>=70){
            grade="C";
        }
        else if(percent>=60){
            grade="D";
        }
        else if(percent>=40){
            grade="E";
        }
        else{
            grade="F";
        }
        System.out.println("              --RESULT--");
        System.out.println("Subject|Max Marks|Mark obtained");
        for (int i=0;i<num;i++){
            System.out.println(subs[i]+"    |   100   |     "+mrk[i]);
        }
        System.out.print("Average: "+percent+"%      Grade: "+grade);
    }
}
