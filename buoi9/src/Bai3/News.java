package Bai3;

import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publicDate;
    private String author;
    private String content;
    private int[] rateList = new int[3];
    private float averageRate = Calculate();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int[] getRateList() {
        return rateList;
    }

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    void nhap() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your evaluate: ");
            Scanner sc = new Scanner(System.in);
            rateList[i] = sc.nextInt();
        }
    }

    public float Calculate() {
        float t = 0;
        for (int i = 0; i < 3; i++) {
            t += rateList[i];
        }
        return (float)t/3;
    }

    @Override
    public void Display() {
        averageRate = Calculate();
        System.out.printf("%-20s %-20s %-20s %-20s", getTitle(), getPublicDate(), getAuthor(), getContent());
    }

}
