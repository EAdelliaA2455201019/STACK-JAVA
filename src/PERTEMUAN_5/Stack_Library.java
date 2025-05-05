/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_5;

/**
 *
 * @author WINDOWS 10
 */
// Mengimpor kelas Stack dari library java.util
// Stack adalah struktur data yang menggunakan prinsip LIFO (Last In, First Out)
// Artinya, elemen yang terakhir ditambahkan akan menjadi elemen pertama yang dikeluarkan
import java.util.Stack;

public class Stack_Library {
    public static void main(String[] args) {
       
        // Membuat objek Stack bertipe String untuk menyimpan buku
        Stack<String> stackBuku = new Stack<>();

        // Menambahkan buku ke dalam stack (push = menaruh di atas tumpukan)
        stackBuku.push("Pemrograman Java Dasar");
        stackBuku.push("Struktur Data");
        stackBuku.push("Basis Data");
        stackBuku.push("Algoritma dan Pemrograman");
        stackBuku.push("Jaringan Komputer");
        stackBuku.push("Sistem Operasi");

        // Menampilkan semua isi stack (dari bawah ke atas)
        System.out.println("Isi stack buku:");
        for (int i = 0; i < stackBuku.size(); i++) {
        System.out.println((i + 1) + ". " + stackBuku.get(i));
        }

        // Melihat buku paling atas tanpa menghapusnya (peek)
        System.out.println("Buku teratas: " + stackBuku.peek());

        // Mengambil buku paling atas dari stack (pop = ambil & hapus dari atas)
        System.out.println("Mengambil buku: " + stackBuku.pop());

        System.out.println();

        // Menampilkan isi stack setelah satu buku di-pop
        System.out.println("Isi stack setelah pop:");
        for (int i = 0; i < stackBuku.size(); i++) {
        System.out.println((i + 1) + ". " + stackBuku.get(i));
        }

        System.out.println();

        // Melakukan pencarian buku berdasarkan kata kunci
        String kataKunci = "data";
        System.out.println("Pencarian buku dengan kata kunci '" + kataKunci + "':");
        boolean ditemukan = false;

        // Loop untuk mencari buku yang mengandung kata kunci
        for (int i = 0; i < stackBuku.size(); i++) {
            if (stackBuku.get(i).toLowerCase().contains(kataKunci.toLowerCase())) {
                System.out.println("- " + stackBuku.get(i) + " (posisi ke-" + (i + 1) + ")");
                ditemukan = true;
            }
        }

        // Jika tidak ditemukan buku yang sesuai
        if (!ditemukan) {
            System.out.println("Tidak ada buku yang cocok.");
        }
    }
}
