public class Dog extends Animals {
    static int dogCount;
    Dog(String name) {
        super(name);
        count++;
        dogCount++;
    }
    void swim (int s) {
        if (s > 10) {
            s = 10;
            System.out.println(name + " собаки проплывают максимум " + s + " метров");
        }
    }
    void run (int r) {
        if (r > 500) {
            r = 500;
            System.out.println(name + " собаки пробегаеют максимум " + r + " метров");
        }
        System.out.println(name + " пробегает " + r + " метров");
    }
}
