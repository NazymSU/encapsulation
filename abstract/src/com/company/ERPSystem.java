package com.company;

public class ERPSystem {
    User[] memory =new User[10];
    int sizeOfUsers=0;
    void addUser(User u) {
        if (sizeOfUsers < memory.length) {
            memory[sizeOfUsers] = u;
            sizeOfUsers++;
        } else {
            System.out.println("Memory is full. Cannot add more users.");
        }
    }

    void printAllUsers(){
        for (int i = 0; i < memory.length; i++) {
            System.out.println(memory[i].getUserData());
        }
    }
    void printUser(int index){
        if (index< sizeOfUsers){
            System.out.println(memory[index].getUserData());
        }else{
            System.out.println("No user in this index");
        }
    }
}
