package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("Tùng");
        p1.setAge(19);
        p1.setGender("Nam");
        p1.setHobby("Chơi game");
        System.out.println(p1.toString());
        p2.setName("Tùng");
        p2.setAge(18);
        p2.setGender("Nam");
        p2.setHobby("Xem phim");
        System.out.println(p2.toString());
    }
}
