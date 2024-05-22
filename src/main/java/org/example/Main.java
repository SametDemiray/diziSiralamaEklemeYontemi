package org.example;

// Klavyeden girilen N elemanlı A dizisini küçükten büyüğe doğru "Eklemeli(araya eklemeli,yerleştirme) Sıralama (insertion sort)"
// algoritmasıyla sıralayan program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i,j,n,g;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nDizinin Eleman Sayısı : ");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println();

        for (i=0; i<n; i++) {
            System.out.printf("A(" + (i + 1) + ") : ");
            a[i] = scanner.nextInt();
        }

        for (i=1; i<n; i++){
            g = a[i];
            j = i-1;


            while ((j>-1) &&(a[j]>g)) {
                a[j + 1] = a[j];
                j--;
                a[j + 1] = g;
            }
        }
        System.out.printf("\nSıralı Dizi :\n------------\n");
        for (i=0; i<n; i++)
            System.out.printf("%d\t",a[i]);
    }
}