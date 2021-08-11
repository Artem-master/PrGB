import java.util.Arrays;

public class Employee {
    public static void main(String[] args) {
        Employee empl = new Employee ("aaa", "QA", "MyMail", 8916, 1000,50);
        System.out.println(empl.lfpName + " " + empl.post + " " + empl.email + " " + empl.phone + " " + empl.pay + " " + empl.age);

        Employee [] arrPers = new Employee [5];
        String name;
        arrPers [0] = new Employee ("name", "ASD", "QWE", 1234, 100, 10);
        arrPers [1] = new Employee ("QQQ", "ASD", "QWE", 1234, 100, 60);
        arrPers [2] = new Employee ("QQQ", "ASD", "QWE", 1234, 100, 10);
        arrPers [3] = new Employee ("QQQ", "ASD", "QWE", 1234, 100, 70);
        arrPers [4] = new Employee ("QQQ", "ASD", "QWE", 1234, 100, 51);
        for (int i = 0; i < arrPers.length; i++) {
            if (arrPers[i].age >= 50) {
                System.out.println(arrPers[i].lfpName + " " + arrPers[i].age);
            }
        }
        System.out.println();
    }

    String lfpName;
    String post;
    String email;
    int phone;
    int pay;
    int age;

    Employee (String lfpName, String post, String email, int phone, int pay, int age) {
        this.lfpName = lfpName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }
}
