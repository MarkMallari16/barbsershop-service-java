package barbershopservice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Choose your 1st service : ");
            String service1 = sc.nextLine();

            System.out.print("Choose your 2nd service : ");
            String service2 = sc.nextLine();

            System.out.print("Choose your 3rd service : ");
            String service3 = sc.nextLine();

            ThirdClass tc = new ThirdClass();

            if (service1.equals("cut") && service2.equals("shave") && service3.equals("haircolor")) {
                System.out.println("You chose: " + service1 + " " + service2 + " " + service3);
                tc.getTotal(100, 150, 200);
            } else if (service1.equals("cut") && service2.equals("") && service3.equals("haircolor")) {
                System.out.println("You chose: " + service1 + " " + service3);
                tc.getTotal(100, 0, 200);
            } else if (service1.equals("cut") && service2.equals("shave") && service3.equals("")) {
                System.out.println("You chose: " + service1 + " " + service2);
                tc.getTotal(100, 150, 0);
            } else if (service1.equals("") && service2.equals("shave") && service3.equals("haircolor")) {
                System.out.println("You chose: " + service2 + " " + service3);
                tc.getTotal(0, 150, 200);
            } else if (service1.equals("") && service2.equals("") && service3.equals("haircolor")) {
                System.out.println("You chose: " + service3);
                tc.getTotal(0, 0, 200);
            } else if (service1.equals("cut") && service2.equals("") && service3.equals("")) {
                System.out.println("You chose: " + service2);
                tc.getTotal(100, 0, 0);
            } else if (service1.equals("") && service2.equals("shave") && service3.equals("")) {
                System.out.println("You chose: " + service2);
                tc.getTotal(0, 150, 0);
            } else if (service1.equals("cut") && service2.equals("") && service3.equals("")) {
                System.out.println("You chose: " + service1);
                tc.getTotal(100, 0, 0);
            } else {
                System.out.println("No service/invalid service found.");
            }
            break;
        }
    }
}
