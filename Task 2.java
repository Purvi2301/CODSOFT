import java.util.* ;
public class Main {
    public static void main(String[] args) {

        System.out.println(" STUDENT GRADE CALCULATOR : ");
        System.out.println("--------------------------");
        Scanner in = new Scanner(System.in);

        System.out.println(" Enter Your Name : ");
        String name = in.nextLine();

        System.out.println("Enter the Total No. of Subjects : ");
        int n = in.nextInt();
        int c = n ;

        int sum = 0 ;

        // Taking input from student :

        while(n>0){
            System.out.println("Enter Subject's Name :");
            String s = in.next();
            System.out.println("Enter Marks Obtained in It :");
            int m = in.nextInt();
            sum = sum + m ;
            n-=1 ;
        }
        float avg = sum / c ;
        System.out.println("Result :");
        System.out.println( "Name : " + name + "\n ----------");
        System.out.println("The Total Obtained Marks out of " + c * 100 +":");
        System.out.println(sum);
        System.out.println(" Percentage :");
        System.out.println(avg);

        // Printing Grades According to the percentage :

        if(avg > 90)
            System.out.println("Congratulations !! \n Grade : AA");
        if(avg <=90 && avg > 80)
            System.out.println("Congratulations !! \n Grade : AB");
        if(avg <= 80 && avg > 70)
            System.out.println("Congratulations !! \n Grade : BB");
        if(avg <= 70 && avg > 60)
            System.out.println("Better luck next time !! \n  Grade : BC");
        if(avg <= 60 )
            System.out.println(" Grade : CC");
    }


}