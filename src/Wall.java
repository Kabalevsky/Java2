public class Wall extends Actions {
    private int height;

    public Wall(int height) {
        super("Стена");
        this.height = height;
        System.out.println("Высота стены " + height + " м.");
    }
    public int getHight() {
        return height;
    }
}
