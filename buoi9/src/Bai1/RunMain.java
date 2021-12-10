package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person1 = new Employee("Lam", "HN", 2000);
        Person person2 = new Custormer("Tung","HN",3000);
        person1.display();
        person2.display();
    }
}
