import java.util.Scanner;
public class Selection2Exp109 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner (System.in);
        System.out.print("Input the year : ");
        int year = input09.nextInt();

        if(year%4 == 0)
            if(year%100 != 0)
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year");

    }
}