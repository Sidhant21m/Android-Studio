import java.util.Scanner;

/**
 * Created by Sidhant on 17-03-2018.
 */

public class Bmi {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter height in metres-->");
        long h= scn.nextLong();
        System.out.println("Enter weight in kgs-->");
        long w= scn.nextLong();
        double ans = (h/(w*w));
        System.out.print("Your BMI = "+ans);


    }

}
