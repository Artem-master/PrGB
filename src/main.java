public class main {
    public static void main(String[] args) {
        Animals MusCat = new Cat ("Муся");
        Animals DusCat = new Cat ("Дуся");
        Animals DogBob = new Dog ("Bob");
        MusCat.swim(10);
        DogBob.swim(100);
        MusCat.run(150);
        DogBob.run(100);
        System.out.println("Всего животных " + Animals.count + " из них " + Cat.countCat + " кошки(ек) " + Dog.dogCount + " собак(и)");
        System.out.println("Всего кошек " + Cat.countCat);
        System.out.println("Всего собак " + Dog.dogCount);
    }
}
