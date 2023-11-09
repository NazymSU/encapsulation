class UserBean implements UserBeanLocal{
    private  Users users[];

    public UserBean(Users[] users) {
        this.users = users;
    }

    public Users[] getUsers() {
        return users;
    }

    @Override
    public Users[] getAllUsers() {
        return users;
    }

    @Override
    public Users getUsersByName(String name) {
        for (Users user : users) {
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public Users getUsersBySurname(String surname) {
        for (Users user : users) {
            if(user.getSurname().equals(surname)){
                return user;
            }
        }
        return null;
    }
}
