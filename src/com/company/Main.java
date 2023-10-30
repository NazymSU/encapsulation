package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BankApplication bankApp = new BankApplication("Java intensive - Almaty", "Almaty");

        while(true){
            System.out.println("Welcome to "+ bankApp.getName());
            System.out.println("PRESS");
            System.out.println("[1] TO ADD WORKER PRESS");
            System.out.println("[2] TO LIST WORKER");
            System.out.println("[0] TO EXIT");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Insert name: ");
                    String name = in.nextLine();
                    System.out.println("Insert surname: ");
                    String surname=in.nextLine();
                    System.out.println("Insert department: ");
                    String department=in.nextLine();
                    System.out.println("Insert salary: ");
                    int salary=in.nextInt();

                    bankApp.addWorker(name,surname,department,salary);
                    break;
                case 2:
                    bankApp.listWorkers();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
            }

        }
    }
}
