public interface UserBeanLocal {
    Users[] getAllUsers();
    Users getUsersByName(String name);
    Users getUsersBySurname(String surname);
}
