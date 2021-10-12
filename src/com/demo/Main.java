package com.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[10];
        input(listBook);
        output(listBook);
        sumPrice(listBook);
        searchBook(listBook);

    }
    public static void input(Book[] listBook){
        for(int i = 0; i < listBook.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập vào thông tin");
            System.out.println("nhập vào tên sách:");
            String name = sc.nextLine();
            System.out.println("nhập vào thể loại sách:");
            String category = sc.nextLine();
            System.out.println("nhập vào tác giả sách:");
            String author = sc.nextLine();
            System.out.println("nhập vào giá sách:");
            double price = sc.nextDouble();
            System.out.println("nhập vào số lượng sách:");
            int amount = sc.nextInt();
            Book book = new Book(name,price,amount,category,author);
            listBook[i] = book;
        }
    }
    public static void output(Book[] listBook){
        for (int i = 0;i < 10;i++){
            System.out.println(listBook[i]);
        }
    }
    public static void sumPrice(Book[] listBook){
        int sum = 0;
        for (int i = 0;i < 10;i++){
            sum += listBook[i].price*listBook[i].amount;
        }
        System.out.println(sum);
    }
    public static void searchBook(Book[] listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sách cần tìm ");
        String nameb = sc.nextLine();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i].name.equals(nameb)) {
                check = true;
                index = i;
            }
        }
        if (check) {
            System.out.println(listBook[index]);
        } else {
            System.out.println("not in the list");
        }
    }

}
