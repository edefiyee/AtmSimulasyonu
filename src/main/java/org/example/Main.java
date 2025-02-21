package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ÖDEV1
//kullanıcıdan şifre aldım ve hatalıysa ekrana yanlış diye yazdırdım
        String correctpasword = "123456";
        double bakiye = 5000.0;
        System.out.println("Şifre giriniz:");

        Scanner scanner = new Scanner(System.in);
        String pasword = scanner.next();
        if (!pasword.equals(correctpasword)) {
            System.out.println("Şifre yanlış");
        } else {
            System.out.println("Giriş yaptınız");
        }

        while (true) {
            System.out.println("işleminizi seçiniz:");
            System.out.println("1-Bakiye Sorgulama");
            System.out.println("2-Para Yatırma");
            System.out.println("3-Para Çekme");
            System.out.println("4-Çıkış");
            System.out.print("isteğiniz:");

            int istek = scanner.nextInt();
            if (istek == 1) {
                System.out.println("bakiyeniz:" + bakiye);
            } else if (istek == 2) {
                System.out.println("yatırmak istenilen miktarı giriniz:");
                double miktar = scanner.nextDouble();
                bakiye += miktar;
                System.out.println("Güncel bakiyeniz:" + bakiye);

            } else if (istek == 3) {
                System.out.println("Çekmek istediğiniz miktarı giriniz:");
                double miktar = scanner.nextDouble();

                if (miktar <= bakiye) {
                    bakiye -= miktar;
                    System.out.println("güncel bakiye:" + bakiye);
                } else {
                    System.out.println("Yetersiz bakiye");
                }

            } else if (istek == 4) {
                System.out.println("Çıkış yapılıyor...");

            } else {
                System.out.println("tekrar deneyiniz");
                break;

            }


        }
    }
}
