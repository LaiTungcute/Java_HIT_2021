package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t;
        ArrayList<News> news = new ArrayList<>();
        do {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average news");
            System.out.println("4. Exit news");
            System.out.print("Enter your choose: ");
            t = sc.nextInt();
            switch (t) {
                case 1:
                    nhap(news);
                    break;
                case 2:
                    xuat1(news);
                    break;
                case 3:
                    xuat2(news);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("This item does not exist. Please re-enter");
                    break;
            }
        }while (true);
    }

    public static void nhap(ArrayList<News> news) {
        News New = new News();
        System.out.print("Enter id: ");
        New.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter title: ");
        New.setTitle(sc.nextLine());
        System.out.print("Enter publish date: ");
        New.setPublicDate(sc.nextLine());
        System.out.print("Enter author: ");
        New.setAuthor(sc.nextLine());
        System.out.print("Enter content: ");
        New.setContent(sc.nextLine());
        New.nhap();
        news.add(New);
    }

    public static void xuat1(ArrayList<News> news) {
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Title", "Public date", "Author", "Content");
        for (int i = 0; i < news.size(); i++) {
            news.get(i).Display();
            System.out.println();
        }
    }

    public static void xuat2(ArrayList<News> news) {
        System.out.printf("%-20s %-20s %-20s %-20s %-10s\n", "Title", "Public date", "Author", "Content", "Average rate");
        for (int i = 0; i < news.size(); i++) {
            news.get(i).Display();
            System.out.printf("%-10f",news.get(i).getAverageRate());
            System.out.println();
        }
    }
}
