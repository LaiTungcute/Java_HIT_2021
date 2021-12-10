package Bai1;

public class Custormer extends Person{
    private int salary;
    public Custormer(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("\t\t\tCustomer info");
        System.out.println("Customer name: "+super.getName());
        System.out.println("Customer address: "+super.getAddress());
        System.out.println("Customer salary: "+salary);
    }

}
