package HW3.main.task2;

public class User {
    String name;
    String password;

    Role userRole;

    boolean isAuthenticate = false;

    public User(String name, String password, Role userRole) {
        this.name = name;
        this.password = password;
        this.userRole = userRole;
    }

    /**
     * Àâòîðèçàöèÿ ïîëüçîâàòåëÿ
     *
     * @param name     èìÿ ïîëüçîâàòåëÿ
     * @param password ïàðîëü ïîëüçîâàòåëÿ
     * @return óñïåøíàÿ àâòîðèçàöèÿ - true èíà÷å false
     */
    public boolean authenticate(String name, String password) {
        this.isAuthenticate = (this.name.equals(name) && this.password.equals(password));
        return this.isAuthenticate;
    }

    /**
     * ßâëÿåòñÿ ëè ïîëüçîâàòåëü àäìèíèñòðàòîðîì
     *
     * @return true åñëè ÿâëÿåòñÿ, èíà÷å false
     */
    public boolean isRoleAdmin() {
        return this.userRole.equals(Role.ADMIN);
    }

}
