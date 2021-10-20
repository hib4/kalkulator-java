package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Character operator;
        int nilaiSatu, nilaiDua, hasilJumlah, hasilKurang, hasilKali, hasilSisa;
        double angkaSatu, angkaDua, hasilBagi;

        Scanner angka = new Scanner(System.in);
        Scanner opt = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama : ");
        nilaiSatu = angka.nextInt();

        System.out.print("Masukkan Operator : ");
        operator = opt.next().charAt(0);

        System.out.print("Masukkan Angka Kedua : ");
        nilaiDua = angka.nextInt();

        if (operator == '+') {
            hasilJumlah = nilaiSatu + nilaiDua;
            System.out.println("Hasil Penjumlahan : " + hasilJumlah);
        } else if (operator == '-') {
            hasilKurang = nilaiSatu - nilaiDua;
            System.out.println("Hasil Pengurangan : " + hasilKurang);
        } else if (operator == '*') {
            hasilKali = nilaiSatu * nilaiDua;
            System.out.println("Hasil Perkalian : " + hasilKali);
        } else if (operator == '/') {
            angkaSatu = nilaiSatu;
            angkaDua = nilaiDua;
            hasilBagi = nilaiSatu / nilaiDua;
            System.out.println("Hasil Pembagian : " + hasilBagi);
        } else if (operator == '%') {
            hasilSisa = nilaiSatu % nilaiDua;
            System.out.println("Hasil Sisa : " + hasilSisa);
        } else {
            System.out.println("Operator tidak valid!");
        }

    }
}
