public class Actions {
    String role;
    public Actions (String role) {
        this.role = role;
    }
    public void jump() {
        System.out.println(role + " подпрыгнул.");
    }
    public void run() { System.out.println(role + " пробежал. \n");
    }
    public String getRole() {
        return role;
    }
}