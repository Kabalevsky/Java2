package Lesson1;

public class Treadmill extends Actions {
    private int lenght;

    public Treadmill(int lenght) {
        super("Беговая дорожка");
        this.lenght = lenght;
        System.out.println("Длина беговой дорожки " + lenght + " м. \n");
    }
    public int getLenght() {
        return lenght;
    }
}
