/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linearequation;


import java.util.Scanner;

public class LinearEquation {
    // Variabel-variabel untuk menyimpan koefisien persamaan linear
    private double a, b, c, d, e, f;

    // Constructor default
    public LinearEquation() {
        // Tidak ada yang perlu dilakukan di sini
    }

    // Metode untuk mendapatkan nilai koefisien a
    public double getA() {
        return a;
    }

    // Metode untuk mendapatkan nilai koefisien b
    public double getB() {
        return b;
    }

    // Metode untuk mendapatkan nilai koefisien c
    public double getC() {
        return c;
    }

    // Metode untuk mendapatkan nilai koefisien d
    public double getD() {
        return d;
    }

    // Metode untuk mendapatkan nilai koefisien e
    public double getE() {
        return e;
    }

    // Metode untuk mendapatkan nilai koefisien f
    public double getF() {
        return f;
    }

    // Metode untuk mengatur koefisien persamaan linear
    public void setCoefficients(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Metode untuk memeriksa apakah persamaan dapat diselesaikan
    public boolean isSolvable() {
        // Persamaan dapat diselesaikan jika determinan tidak sama dengan 0
        return (a * d - b * c) != 0;
    }

    // Metode untuk menghitung dan mengembalikan nilai x
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // Metode untuk menghitung dan mengembalikan nilai y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai koefisien persamaan
        System.out.println("Masukkan nilai koefisien untuk persamaan linear (ax + by = e, cx + dy = f):");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Membuat objek persamaan linear
        LinearEquation linearEquation = new LinearEquation();
        linearEquation.setCoefficients(a, b, c, d, e, f);

        // Memeriksa apakah persamaan dapat diselesaikan
        if (linearEquation.isSolvable()) {
            // Jika persamaan dapat diselesaikan, mencetak solusi ke layar
            System.out.println("Solusi dari persamaan linear:");
            System.out.println("x = " + linearEquation.getX());
            System.out.println("y = " + linearEquation.getY());
        } else {
            // Jika persamaan tidak dapat diselesaikan, mencetak pesan ke layar
            System.out.println("Persamaan tidak memiliki solusi.");
        }

        // Menutup objek Scanner
        input.close();
    }
}
