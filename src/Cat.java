public class Cat extends Animals {
    static int countCat;
    Cat(String name) {
        super(name);
        count++;
        countCat++;
    }
    void swim (int s) {
        if (s > 0) {
            System.out.println(name + " - кошки не плавают");
        }
    }
    void run (int r) {
        if (r > 200) {
            r = 200;
            System.out.println(name + " Кошки пробегаеют максимум " + r + " метров");
        }
        System.out.println(name + " пробегает " + r + " метров");
    }
}

