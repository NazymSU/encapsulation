package com.company;


import com.*;

public class Main {

    public static void main(String[] args) {
//        1 task
//        String subjects[]={"java","c++","python"};
//        String courses[]={"math","cisco"};
//        User user = new User(1,"admin","123","Erlan","Karabaliyev");
//        Staff staff =new Staff(2,"staff","456","Nazym","Kazizmurat",500000,subjects);
//        Student student = new Student(3,"student","012","Saniya","Erbolat",3.7,courses);
//        User users[]= {user, staff, student};
//        for (User user1:users) {
//            System.out.println(user1.getData());
//        }

//        2 task
//            Scanner in=new Scanner(System.in);
//            List<User> users = new ArrayList<>();
//            String  []subjects = new String[3];
//            String  []courses = new String[3];
//            while (true){
//                System.out.println("PRESS [1] ADD USER");
//                System.out.println("PRESS [2] TO LIST USERS");
//                System.out.println("PRESS [0] TO EXIT");
//                int choice = in.nextInt();
//                switch (choice){
//                    case 1:
//                        System.out.println("PRESS [1] ADD STUDENT");
//                        System.out.println("PRESS [2] ADD STAFF");
//                        int choice1= in.nextInt();
//                        switch (choice1){
//                            case 1:
//                                System.out.print("ID: ");
//                                int id = in.nextInt();
//                                in.nextLine();
//                                System.out.print("Login: ");
//                                String login = in.nextLine();
//                                System.out.print("Password: ");
//                                String password = in.nextLine();
//                                System.out.print("Name: ");
//                                String name = in.nextLine();
//                                System.out.print("Surname: ");
//                                String surname = in.nextLine();
//                                System.out.println("GPA:");
//                                double gpa= in.nextDouble();
//                                System.out.println("Courses: ");
//                                for (int i = 0; i < courses.length; i++) {
//                                    courses[i]=in.nextLine();
//                                }
//                                User student = new Student(id, login, password, name, surname,gpa,courses);
//                                users.add(student);
//                                System.out.println("Student added successfully.");
//                                break;
//                            case 2:
//                                System.out.print("ID: ");
//                                int id1 = in.nextInt();
//                                in.nextLine();
//                                System.out.print("Login: ");
//                                String login1 = in.nextLine();
//                                System.out.print("Password: ");
//                                String password1 = in.nextLine();
//                                System.out.print("Name: ");
//                                String name1 = in.nextLine();
//                                System.out.print("Surname: ");
//                                String surname1 = in.nextLine();
//                                System.out.println("Salary:");
//                                double salary= in.nextDouble();
//                                System.out.println("Subjects: ");
//                                for (int i = 0; i < subjects.length; i++) {
//                                    subjects[i]=in.nextLine();
//                                }
//                                User staff= new Staff(id1, login1, password1, name1, surname1,salary,subjects);
//                                users.add(staff);
//                                System.out.println("Staff added successfully.");
//                                break;
//                        }
//                        break;
//                    case 2:
//                        System.out.println("PRESS [1] TO LIST STUDENT");
//                        System.out.println("PRESS [2] TO LIST STAFF");
//                        int choise2=in.nextInt();
//                        switch (choise2){
//                            case 1:
//                                for (User user : users) {
//                                    if(user instanceof Student){
//                                        System.out.println(user.getData());
//                                    }
//                                } break;
//                            case 2:
//                                for (User user : users) {
//                                    if (user instanceof  Staff){
//                                        System.out.println(user.getData());
//                                    }
//                                }
//                        }
//                        break;
//                    case 0:
//                        System.out.println("EXAM PROGRAM");
//                        break;
//                }
//            }

         //3 task
        Book[] b = new Book[10];
        b[0] = new ScientificBook("Science Book 1", "SC001", 300, 50, "Publisher A");
        b[1] = new ScientificBook("Science Book 2", "SC002", 400, 60, "Publisher B");
        b[2] = new LiteratureBook("Literature Book 1", "L001", 200, "Author X", 1990);
        b[3] = new LiteratureBook("Literature Book 2", "L002", 250, "Author Y", 2000);
        b[4] = new ScientificBook("Science Book 3", "SC003", 350, 55, "Publisher C");

        Library library = new Library("My Library", "Almaty", "Kazakhstan", b);
        library.printLibraryData();
        }

    }

