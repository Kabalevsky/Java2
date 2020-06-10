package Lesson1;

public class Main {
    public static void main(String[] args) {


        int distanceMin = 1;
        int distanceMax = 6;
        int heightMin = 1;
        int heightMax = 4;
        int distanceTreadmill =  distanceMin + (int) (Math.random() * distanceMax);
        int heightWall = heightMin + (int) (Math.random() * heightMax);
        int distanceHuman =  distanceMin + (int) (Math.random() * distanceMax);
        int heightHuman = heightMin + (int) (Math.random() * heightMax);
        int distanceRobot =  distanceMin + (int) (Math.random() * distanceMax);
        int heightRobot = heightMin + (int) (Math.random() * heightMax);
        int distanceCat =  distanceMin + (int) (Math.random() * distanceMax);
        int heightCat = heightMin + (int) (Math.random() * heightMax);
        Human human = new Human(distanceHuman, heightHuman);
        Robot robot = new Robot(distanceRobot, heightRobot);
        Cat cat = new Cat(distanceCat, heightCat);

        System.out.println("Задание №1");
        human.jump();
        human.run();
        robot.jump();
        robot.run();
        cat.jump();
        cat.run();

        System.out.println("Задание №2");

        Wall wall = new Wall(heightWall);
        Treadmill treadmill = new Treadmill(distanceTreadmill);

        human.jump(wall);
        human.run(treadmill);
        robot.jump(wall);
        robot.run(treadmill);
        cat.jump(wall);
        cat.run(treadmill);

        System.out.println("Задание №3");
        Wall w = new Wall(heightWall);
        Treadmill track = new Treadmill(distanceTreadmill);
        Human h[]  = new Human[1];
        Robot r[]  = new Robot[1];
        Cat c[]  = new Cat[1];


        for (int i = 0; i < 1; i++) {
            h[i] = new Human(distanceHuman, heightHuman);
            r[i] = new Robot(distanceRobot, heightRobot);
            c[i] = new Cat(distanceCat, heightCat);
        }


        for (int i = 0; i < 1; i++) {
            if (!h[i].failure) h[i].failure = h[i].jump(w);
            System.out.println(h[i].getRole() + ((h[i].failure)?" не проходит к следующему препятствию. \n":" проходит к следующему препятствию.\n"));
            if (!r[i].failure) r[i].failure = r[i].jump(w);
            System.out.println(r[i].getRole() + ((r[i].failure)?" не проходит к следующему препятствию. \n":" проходит к следующему препятствию.\n"));
            if (!c[i].failure) c[i].failure = c[i].jump(w);
            System.out.println(c[i].getRole() + ((c[i].failure)?" не проходит к следующему препятствию. \n":" проходит к следующему препятствию.\n"));
        }

        for (int i = 0; i < 1; i++) {
            h[i].failure = h[i].run(track);
            System.out.println(h[i].getRole() + ((h[i].failure)?" не проходит к следующему препятствию. \n":" проходит к следующему препятствию.\n"));
            r[i].failure = r[i].run(track);
            System.out.println(r[i].getRole() + ((r[i].failure)?" не проходит к следующему препятствию. \n":" проходит к следующему препятствию.\n"));
            c[i].failure = c[i].run(track);
            System.out.println(c[i].getRole() + ((c[i].failure)?" не проходит к следующему препятствию. \n":" проходит к следующему препятствию.\n"));
        }
    }
}