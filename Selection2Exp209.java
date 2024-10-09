import java.util.Scanner;
public class Selection2Exp209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner (System.in);
        System.out.print("input Angle 1 = ");
        int angle1 = input09.nextInt();
        System.out.print("input Angle 2 = ");
        int angle2 = input09.nextInt();
        System.out.print("input Angle 3 = ");
        int angle3 = input09.nextInt();
        int totalAngle;
        totalAngle = angle1+angle2+angle3;
        
        if(totalAngle == 180)
            if(angle1==90 || angle2==90 || angle3==90)
                System.out.print("Right triangle");
            else if(angle1 == angle2 && angle2 == angle3)
                System.out.print("Equilateral triangle");
            else if(angle1 == angle2 || angle2 == angle3 || angle3 == angle1)
                System.out.print("Isosceles triangle");
            else
                System.out.print("Not a valid triangle");
        else
            System.out.print("Not a triangle");

    }
}
