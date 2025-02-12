/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author RIFQI
 */
import java.util.Scanner;

public class Mavenproject1 {
    // Daftar produk dan harganya
    static String[] produk = {"Woolpeach Lux", "Yoris", "BabyDoll Supreme"};
    static int[] harga = {16500, 15000, 11000};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Memasukkan nama customer
        System.out.print("Masukkan nama customer: ");
        String namaPelanggan = scanner.nextLine();
        
        // Menampilkan daftar produk
        System.out.println("\nDaftar Produk Kain:");
        for (int i = 0; i < produk.length; i++) {
            System.out.println((i + 1) + ". " + produk[i] + " - Rp " + harga[i]);
        }
        
        // Memilih produk
        System.out.print("\nMasukkan nomor produk yang dipilih: ");
        int pilihan = scanner.nextInt();
        
        // Validasi pilihan produk
        if (pilihan < 1 || pilihan > produk.length) {
            System.out.println("Pilihan tidak valid!");
            return;
        }
        
        // Memasukkan jumlah barang
        System.out.print("Masukkan jumlah yard: ");
        int jumlah = scanner.nextInt();
        
        // Menghitung total harga
        int totalHarga = hitungTotal(harga[pilihan - 1], jumlah);
        
        // Menampilkan nota
        cetakNota(namaPelanggan, produk[pilihan - 1], harga[pilihan - 1], jumlah, totalHarga);
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung total harga
    public static int hitungTotal(int hargaSatuan, int jumlah) {
        return hargaSatuan * jumlah;
    }
    
    // Prosedur untuk mencetak nota
    public static void cetakNota(String nama, String produk, int harga, int jumlah, int total) {
        System.out.println("\n===== NOTA PEMBELIAN =====");
        System.out.println("Nama Pelanggan  : " + nama);
        System.out.println("Produk          : " + produk);
        System.out.println("Harga Peryard   : Rp " + harga);
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Total Harga     : Rp " + total);
        System.out.println("==========================");
    }
}
