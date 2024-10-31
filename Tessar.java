package Inventory;

import java.util.Scanner;

public class Tessar{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //array project
        System.out.println("masukkan jumlah object");
        int object = s.nextInt();
        product[] p = new product[object];
        //loop
        for (int i = 0; i < p.length; i++) {
            System.out.println("nama");
            String nama = s.nextLine();
            System.out.println("number");
            int number = s.nextInt();
            System.out.println("quantity");
            int quantity =s.nextInt();
            System.out.println("price");
            double price =s.nextDouble();
            p[i] = new product(number, nama, quantity, price);
            p[i].print();
        }
        p[1] = new product();
        
        cd[] c = new cd[5];
        c[4] = new cd();

    }

}