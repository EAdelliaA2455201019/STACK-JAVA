/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_5;

/**
 *
 * @author WINDOWS 10
 */
public class Stack {

    // Variabel array untuk menyimpan buku
    static String[] stackBuku;
    static int maxSize; // Maksimal kapasitas stack
    static int top;     // Menunjukkan indeks atas stack

    // Method untuk menginisialisasi stack
    static void inisialisasiStack(int kapasitas) {
        stackBuku = new String[kapasitas];
        maxSize = kapasitas;
        top = -1; // Stack kosong di awal
    }

    // Method untuk mengecek apakah stack kosong
    static boolean isEmpty() {
        return top == -1;
    }

    // Method untuk mengecek apakah stack penuh
    static boolean isFull() {
        return top == maxSize - 1;
    }

    // Method untuk menambahkan buku ke stack
    static void push(String buku) {
        if (isFull()) {
            System.out.println("Tumpukan sudah penuh. Tidak bisa menambahkan buku lagi.");
        } else {
            top++;
            stackBuku[top] = buku;
            System.out.println("Buku '" + buku + "' berhasil ditambahkan ke tumpukan.");
        }
    }

    // Method untuk mengambil buku dari stack
    static void pop() {
        if (isEmpty()) {
            System.out.println("Tumpukan kosong. Tidak ada buku untuk diambil.");
        } else {
            String bukuDiambil = stackBuku[top];
            top--;
            System.out.println("Buku '" + bukuDiambil + "' berhasil diambil dari tumpukan.");
        }
    }

    // Method untuk melihat buku teratas tanpa mengambilnya
    static void peek() {
        if (isEmpty()) {
            System.out.println("Tumpukan kosong. Tidak ada buku di atas.");
        } else {
            System.out.println("Buku teratas: " + stackBuku[top]);
        }
    }

    // Method untuk menampilkan semua buku di stack
    static void tampilkanBuku() {
        if (isEmpty()) {
            System.out.println("Tumpukan kosong. Tidak ada buku.");
        } else {
            System.out.println("Isi tumpukan buku (dari bawah ke atas):");
            for (int i = 0; i <= top; i++) {
                System.out.println((i + 1) + ". " + stackBuku[i]);
            }
        }
    }

    // Method untuk mencari buku berdasarkan sebagian kata
    static void cariBuku(String kataKunci) {
        if (isEmpty()) {
            System.out.println("Tumpukan kosong. Tidak ada buku yang bisa dicari.");
        } else {
            boolean ditemukan = false;
            System.out.println("Hasil pencarian untuk kata kunci '" + kataKunci + "':");
            for (int i = 0; i <= top; i++) {
                if (stackBuku[i].toLowerCase().contains(kataKunci.toLowerCase())) {
                    System.out.println("- " + stackBuku[i] + " (posisi ke-" + (i + 1) + ")");
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Tidak ada buku yang cocok dengan kata kunci tersebut.");
            }
        }
    }

    public static void main(String[] args) {

        // Menentukan kapasitas stack
        int kapasitas = 6;
        inisialisasiStack(kapasitas); // Inisialisasi stack dengan kapasitas 6

        // Menambahkan beberapa buku ke tumpukan
        push("Pemrograman Java Dasar");
        push("Struktur Data");
        push("Basis Data");
        push("Algoritma dan Pemrograman");
        push("Jaringan Komputer");
        push("Sistem Operasi");

        System.out.println();
        tampilkanBuku(); // Menampilkan semua buku
        
        System.out.println();
        peek(); // Melihat buku teratas

        System.out.println();
        pop(); // Mengambil satu buku dari atas

        System.out.println();
        tampilkanBuku(); // Menampilkan setelah pop
        
        System.out.println();
        peek(); // Melihat buku teratas setelah pop

        System.out.println();
        // Mencoba fitur pencarian (berdasarkan kata kunci sebagian)
        cariBuku("data");  // Harus ketemu "Struktur Data" dan "Basis Data"

        System.out.println();
        cariBuku("python"); // Tidak ada yang ketemu
    }
}
    

