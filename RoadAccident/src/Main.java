import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            String [] Cities = {"Cape Town","Johannesburg","Port Elizabeth"};
            int [] Car = new int[3];
        int [] MotorBike = new int[3];

        for(int i = 0; i<Car.length; i++) {
            System.out.println("Enter the number of car accidents for " + Cities[i]);
            Car[i] = Integer.parseInt(scan.nextLine());
        }
        for(int i =0; i<MotorBike.length; i++) {
            System.out.println("Enter the number of bike accidents for " + Cities[i]);
            String bike = scan.nextLine();
        }


        System.out.println("ROAD ACCIDENT REPORT: " + "\nCities: " + " " +  " " + " " +"Car:"+ "\n" +Cities[0]+ " : " +Car[0] +"\n" + Cities[1] + " : " + Car[1] +"\n" +  Cities[2] + " : " + Car[2] );

    }

    }
