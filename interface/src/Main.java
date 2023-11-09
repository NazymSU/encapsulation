import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
   Users users []={
           new Users("Nazym","Kazizmurat"),
           new Users("John","Smith"),
           new Users("Saniya","Erbolat"),
           new Users("Zhansaya","Bolat"),
           new Users("Kamilla","Zharylkasyn")
   };
   UserBean userBean = new UserBean(users);
   Users[] allUsers = userBean.getAllUsers();
        System.out.println(Arrays.toString(userBean.getAllUsers()));
        System.out.println(userBean.getUsersByName("John"));
        System.out.println(userBean.getUsersBySurname("Smith"));

    }
    }

