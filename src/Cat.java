public class Cat {
    private boolean Fullplate;
    private String name;
    private int appetite;

    public Cat (String name, int appetite) {
        this.name = name;
        this. appetite = appetite;
        Fullplate = false;
    }

    public void eat (Plate plate) {
        plate.consumption(appetite);
        if (plate.rash(appetite) && !Fullplate)
        {
            System.out.println(name + " кушает.");
            plate.rash(appetite);
            Fullplate = true;
        }
        else if (!plate.rash(appetite))
        {
            System.out.println(name + " не хватает еды");
        }
        else if (Fullplate)
        {
            System.out.println(name + " сыта!");
        }
    }
}

