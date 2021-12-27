package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,r,i,fakn=1 ,fakr=1,faknr=1;
        double com=0;
        Scanner input = new Scanner(System.in);

        System.out.println("C(n,r) Hesaplama");
        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        for (i=1;i<=n;i++){
            fakn= fakn * i;
        }

        for (i=1;i<=r;i++){
            fakr= fakr * i;
        }

        for (i=1;i<=n-r;i++){
            faknr= faknr * i;
        }

        com = fakn/(fakr*faknr);
        System.out.println("Sonuç: "+com);
    }
}
