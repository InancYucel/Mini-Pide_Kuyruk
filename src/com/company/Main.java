package com.company;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main{
    // Ramazan Pidesi Uygulaması

    // Fırından 1(dahil) ile 10(dahil) arası pide çıkacak. Kuyruktakiler Pideyi almaya çalışacak.

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Uygulaması....");
        Random random = new Random();

        Queue<String> pide_kuyrugu = new LinkedList<String>();
        pide_kuyrugu.offer("Selçuk");
        pide_kuyrugu.offer("Ahmet");
        pide_kuyrugu.offer("Inanc");
        pide_kuyrugu.offer("Efe");
        pide_kuyrugu.offer("Alper");
        pide_kuyrugu.offer("Cem");
        pide_kuyrugu.offer("İsmail");
        pide_kuyrugu.offer("Yasin");
        pide_kuyrugu.offer("Tuğba");
        pide_kuyrugu.offer("Yasemin");

        int pide_sayisi = 1 + random.nextInt(10);
        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı : " + pide_sayisi);
        Thread.sleep(3000);

        while (pide_sayisi != 0) {

            System.out.println(pide_kuyrugu.poll() + " pideyi aldı...");
            pide_sayisi--;
            Thread.sleep(1000);

        }

        System.out.println("Pide kalmadı...");



    }
}