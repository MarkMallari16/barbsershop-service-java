package barbershopservice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Choose your 1st service: ");
            String service1 = sc.nextLine();

            System.out.print("Choose your 2nd service: ");
            String service2 = sc.nextLine();

            System.out.print("Choose your 3rd service: ");
            String service3 = sc.nextLine();

            ThirdClass tc = new ThirdClass();

            if (service1.equals("cut") && service2.equals("shave") && service3.equals("haircolor")) {
                System.out.println("You chose: " + service1 + " " + service2 + " " + service3);
                tc.FirstChoice(true, true, true);
            } else if (service1.equals("cut") && service2.equals("") && service3.equals("haircolor")) {
                System.out.println("You chose: " + service1 + " " + service3);
                tc.FirstChoice(true, false, true);
            } else if (service1.equals("cut") && service2.equals("shave") && service3.equals("")) {
                System.out.println("You chose: " + service1 + " " + service2);
                tc.FirstChoice(true, true, false);
            } else if (service1.equals("") && service2.equals("shave") && service3.equals("haircolor")) {
                tc.FirstChoice(false, true, true);
            } else if (service1.equals("cut") && service2.equals("") && service3.equals("")) {
                tc.FirstChoice(true, false, false);
            } else if (service1.equals("") && service2.equals("shave") && service3.equals("haircolor")) {
                tc.FirstChoice(true, true, true);
            } else if (service1.equals("") && service2.equals("shave") && service3.equals("")) {
                tc.FirstChoice(false, true, false);
                break;
            }
        }

    }
