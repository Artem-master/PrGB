public class Plate {
    private int quantity;

    public Plate (int quantity) {
        this.quantity = quantity;
    }

    public void consumption (int appetite) {
        this.quantity -= appetite;
    }

    public  void info () {
        System.out.println(quantity);
    }

    public boolean rash (int appetite) {
        return appetite < quantity;
    }

    public void decr (int appetite) {
        if (!rash(appetite))
        {
            System.out.println("Аппетиты больше, чем еды в тарелке!");
        }
        else
        {
            quantity = quantity - appetite;
        }
    }

}
