package Lesson1;

public class Human extends Actions {

    private int jumpHeight;
    private int runLenght;
    public boolean failure = false;


    public Human(int jumpHeight, int runLenght) {
        super("Человек");
        // Высота прыжка, прописывается через генератор случаных чисел в Lesson_1
        this.jumpHeight = jumpHeight;
        // Дистанция бега, прописывается через генератор случаных чисел в Lesson_1
        this.runLenght = runLenght;
    }
    public boolean jump(Wall w) {
        boolean ret;
        ret = w.getHight()>this.jumpHeight;
        System.out.println(this.getRole() + " прыгнул на " + jumpHeight + " м." + (ret?" и не ":" и ") + "преодолел стену.");
        return ret;
    }
    public boolean run(Treadmill t) {
        boolean ret;
        ret = t.getLenght()>this.runLenght;
        System.out.println(this.getRole() + " пробежал " + runLenght + " м."+ (ret?" и не ":" и ") + "преодолел дорожку. \n");
        return ret;
    }
}
