package com.company;


import java.util.Scanner;

public class Main {
    private static int studentIdCounter = 0;
    private static int teacherIdCounter = 0;
    public static void main(String[] args) {
        ERPSystem erpSystem = new ERPSystem();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS[1]TO ADD USER");
            System.out.println("PRESS[2]TO LIST USER");
            System.out.println("PRESS[0] TO EXIT");
            int choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("PRESS[1] TO ADD STUDENT");
                    System.out.println("PRESS[2] TO ADD TEACHER");
                    int choiceUser=in.nextInt();
                    in.nextLine();
                    switch (choiceUser){
                        case 1:
                            studentIdCounter++;
                            System.out.println("Student login:");
                            String sLogin=in.nextLine();
                            System.out.println("password:");
                            String sPassword =in.nextLine();
                            System.out.println("Student name:");
                            String name=in.nextLine();
                            System.out.println("Surname:");
                            String surname=in.nextLine();
                            System.out.println("group:");
                            String group=in.nextLine();
                            System.out.println("GPA:");
                            double gpa=in.nextDouble();
                            in.nextLine();
                            Student student=new Student(studentIdCounter,sLogin, sPassword,name,surname,group,gpa);
                            erpSystem.addUser(student);
                            System.out.println("Student added successfully!");
                            break;
                        case 2:
                            teacherIdCounter++;
                            System.out.println("Enter Teacher login");
                            String tLogin=in.nextLine();
                            System.out.println("Enter Teacher password:");
                            String tPassword=in.nextLine();
                            System.out.println("Enter Teacher Nick Name:");
                            String nickName = in.nextLine();
                            System.out.println("Enter Teacher Status:");
                            String status = in.nextLine();

                                Teacher teacher = new Teacher(teacherIdCounter , tLogin, tPassword, nickName, status);

                                erpSystem.addUser(teacher);


                            int subjectChoice;
                            do {
                                System.out.println("PRESS [1] TO ADD SUBJECT");
                                System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                                subjectChoice = in.nextInt();
                                in.nextLine();

                                if (subjectChoice == 1) {
                                    System.out.println("Enter Subject:");
                                    String subject =in.nextLine();
                                    teacher.addSubject(subject);
                                    System.out.println("Subject added successfully!");
                                }
                            } while (subjectChoice != 0);
                            System.out.println("Teacher added successfully!");
                    }
                    break;
                case 2:
                    System.out.println("PRESS [1] TO LIST STUDENTS");
                    System.out.println("PRESS [2] TO LIST TEACHERS");
                    int listChoice = in.nextInt();
                    in.nextLine();
                    if(listChoice==1){
                        for (int i = 0; i < erpSystem.sizeOfUsers; i++) {
                            if(erpSystem.memory[i] instanceof Student){
                                System.out.println(erpSystem.memory[i].getUserData());
                            }
                        }
                    }else if (listChoice==2){
                        for (int i = 0; i < erpSystem.sizeOfUsers; i++) {
                            if (erpSystem.memory[i] instanceof  Teacher){
                                System.out.println(erpSystem.memory[i].getUserData());
                            }
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }
        }

        

    }

