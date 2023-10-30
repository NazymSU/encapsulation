package com.company;

public class BankApplication {
    private String name;
    private String country;
    private Worker [] workers = new Worker[10];
    private int sizeOfWorkers;

    public BankApplication() {
    }

    public BankApplication(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void addWorker(String name,String surname,String department,int salary){
      if(sizeOfWorkers<workers.length){
          Worker worker=new Worker(sizeOfWorkers+1,name,surname,department,salary);
          workers[sizeOfWorkers]=worker;
          sizeOfWorkers++;
      }else {
          System.out.println("Unable to add  workers");
      }
    }
    public  void listWorkers(){
        System.out.println("List of Workers:");
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }
}
