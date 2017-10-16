package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);
        String name, phone, address, propertyName, answer;
        boolean senior, multiProperty;
        double squareFootage;
        int choice;

        do {
            System.out.println("Choose:\n1. Residential\n2. Commercial\n3. Done");
            choice = scan.nextInt();

            while (choice < 1 && choice > 3){
                System.out.println("Please choose a valid number: ");
                choice = scan.nextInt();
            }
            scan.nextLine();
            if(choice != 3) { //checks if we are breaking the do-while loop
                System.out.print("Enter your name: ");
                name = scan.nextLine();

                System.out.print("Enter your phone: ");
                phone = scan.nextLine();

                System.out.print("Enter your address: ");
                address = scan.nextLine();

                System.out.print("Enter square footage of property: ");
                squareFootage = scan.nextDouble();

                if (choice == 1){ //checks whether commercial or residential
                    System.out.print("Are you a senior(y/n): ");
                    answer = scan.next();

                    while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")){
                        System.out.print("Please answer y or n: ");
                        answer = scan.next();
                    }
                    if (answer.equalsIgnoreCase("y")){
                        senior = true;
                    }else{
                        senior = false;
                    }
                    Residential resident = new Residential(name, address, phone, squareFootage, senior);
                    System.out.println("Your Quote: \n" + resident);
                }else {
                    System.out.print("What is the property name: ");
                    propertyName = scan.next();

                    System.out.print("Are there multiple properties(y/n): ");
                    answer = scan.next();

                    while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")){
                        System.out.print("Please answer y or n: ");
                        answer = scan.next();
                    }
                    if (answer.equalsIgnoreCase("y")){
                        multiProperty = true;
                    }else{
                        multiProperty = false;
                    }

                    Commercial company = new Commercial(name, address, phone, squareFootage, propertyName, multiProperty);
                    System.out.println("Your Quote: \n" + company);
                }
            }
        }while (choice != 3);

        System.out.println("Thank you for inquiring about our services.");
    }
}
