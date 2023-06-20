import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(("inputkan usia anda:"));
        int age = scan.nextInt();
        scan.close();
        System.out.println(checkDrivingUnderAge(age));



    }
    static boolean checkDrivingUnderAge (int age){
        boolean drivingUnderAge = false;
        if (age <= 18)
        {
            drivingUnderAge = true ;
        }
        else {
            drivingUnderAge = false ;
        }
        return drivingUnderAge;
    }


}
