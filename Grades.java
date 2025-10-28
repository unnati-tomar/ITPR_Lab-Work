import java.util.Scanner;

class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks  of students");
            System.out.println("Enter English Marks:") ;
            double e=sc.nextDouble();
           System.out.println("Enter Arts Marks:") ;
        double a =sc.nextDouble();
        System.out.println("Enter Hindi Marks:") ;
        double h=sc.nextDouble();
        System.out.println("Enter computer Marks:") ;
        double c=sc.nextDouble();
        System.out.println("Enter Geographics Marks:") ;
        double g=sc.nextDouble();
        double marks= e+a+h+c+g;
        System.out.println("The marks you entered is: "+marks);
        double percentage= (marks /500)*100;
        System.out.println("The Percentage obtained by Student  is: "+percentage);

        if (percentage >= 75)
        {
            System.out.println("The Grade is :- A+ ");
        } else if (percentage >= 65) {
            System.out.println("The Grade is :- A ");
        } else if (percentage >= 55) {
            System.out.println("The Grade is :- B");
        } else if (percentage >= 45) {
            System.out.println("The Grade is :- c ");
        } else {
            System.out.println("The Grade is :- Fail");
        }
    }
}
