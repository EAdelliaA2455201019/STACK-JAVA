/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_5;

/**
 *
 * @author WINDOWS 10
 */
public class Stack_Tanpa_Library {

    // static digunakan agar variabel bisa diakses langsung oleh method static seperti main()
    // Ini artinya, variabel tersebut milik class dan bukan milik objek dari class tersebut
    static String[] stackBuku;  // Array untuk menyimpan data buku dalam stack
    static int maxSize;         // Menyimpan kapasitas maksimum stack
    static int top;             // Menyimpan indeks dari elemen teratas di stack
    
    // Method untuk menginisialisasi stack
    // Fungsi ini digunakan untuk mengalokasikan memori untuk stackBuku dengan kapasitas tertentu
    // maxSize adalah kapasitas maksimum stack, dan top diset ke -1 yang menunjukkan stack kosong
    static void inisialisasiStack(int kapasitas) {
    stackBuku = new String[kapasitas];  // Membuat array baru dengan ukuran kapasitas yang diberikan
    maxSize = kapasitas;                // Menyimpan kapasitas stack
    top = -1;                           // top diset ke -1, yang berarti stack kosong
}

    // Method untuk mengecek apakah stack kosong
    // Fungsi ini memeriksa apakah stack kosong, yaitu top bernilai -1
    // Mengembalikan true jika stack kosong, dan false jika stack tidak kosong
    static boolean isEmpty() {
        return top == -1; // Mengembalikan true jika top == -1, yang menunjukkan stack kosong
}

    // Method untuk mengecek apakah stack penuh
    // Fungsi ini memeriksa apakah stack sudah penuh berdasarkan maxSize
    // Mengembalikan true jika stack penuh, dan false jika masih ada ruang
    static boolean isFull() {
        return top == maxSize - 1; // Mengembalikan true jika top mencapai kapasitas maksimum stack
}

    // Method untuk menambahkan buku ke stack
    // Fungsi ini digunakan untuk menambahkan buku ke stack jika stack tidak penuh
    // Jika stack penuh, maka akan menampilkan pesan bahwa stack sudah penuh
    static void push(String buku) {
        if (isFull()) { // Mengecek apakah stack sudah penuh
            
            System.out.println("Tumpukan sudah penuh. Tidak bisa menambahkan buku lagi.");
        } else {
            top++;                        // Increment top untuk menunjuk ke posisi berikutnya
            stackBuku[top] = buku;         // Menambahkan buku pada posisi top
            System.out.println("Buku '" + buku + "' berhasil ditambahkan ke tumpukan.");
    }
}

    // Method untuk mengambil buku dari stack
    // Fungsi ini digunakan untuk mengeluarkan buku dari stack (mengambil buku teratas)
    // Jika stack kosong, maka akan menampilkan pesan bahwa stack kosong
    static void pop() {
        if (isEmpty()) { // Mengecek apakah stack kosong
            System.out.println("Tumpukan kosong. Tidak ada buku untuk diambil.");
    } else {
            String bukuDiambil = stackBuku[top]; // Mengambil buku teratas dari stack
            top--; // Mengurangi nilai top untuk mengurangi jumlah buku di stack
            System.out.println("Buku '" + bukuDiambil + "' berhasil diambil dari tumpukan.");
    }
}

    // Method untuk melihat buku teratas tanpa mengambilnya
    // Fungsi ini digunakan untuk melihat buku yang ada di posisi teratas stack tanpa menghapusnya
    // Jika stack kosong, maka akan menampilkan pesan bahwa stack kosong
    static void peek() {
        if (isEmpty()) { // Mengecek apakah stack kosong
             System.out.println("Tumpukan kosong. Tidak ada buku di atas.");
    } else {
             System.out.println("Buku teratas: " + stackBuku[top]); // Menampilkan buku teratas di stack
    }
}

    // Method untuk menampilkan semua buku di stack
    // Fungsi ini digunakan untuk menampilkan seluruh isi stack, mulai dari bawah hingga atas
    // Jika stack kosong, maka akan menampilkan pesan bahwa stack kosong
    static void tampilkanBuku() {
         if (isEmpty()) { // Mengecek apakah stack kosong
              System.out.println("Tumpukan kosong. Tidak ada buku.");
    } else {
              System.out.println("Isi tumpukan buku (dari bawah ke atas):");
              for (int i = 0; i <= top; i++) { // Iterasi melalui setiap elemen dalam stack
              System.out.println((i + 1) + ". " + stackBuku[i]); // Menampilkan buku berdasarkan urutan
        }
    }
}

    // Method untuk mencari buku berdasarkan sebagian kata
    // Fungsi ini digunakan untuk mencari buku dalam stack yang mengandung kata kunci tertentu
    // Pencarian dilakukan dengan cara mencocokkan bagian dari nama buku dengan kata kunci yang diberikan
    static void cariBuku(String kataKunci) {
        if (isEmpty()) { // Mengecek apakah stack kosong
            System.out.println("Tumpukan kosong. Tidak ada buku yang bisa dicari.");
    } else {
        boolean ditemukan = false; // Menandakan apakah pencarian menemukan hasil
            System.out.println("Hasil pencarian untuk kata kunci '" + kataKunci + "':");
        for (int i = 0; i <= top; i++) { // Iterasi melalui setiap buku di stack
            // Mengecek apakah nama buku mengandung kata kunci
            if (stackBuku[i].toLowerCase().contains(kataKunci.toLowerCase())) {
                System.out.println("- " + stackBuku[i] + " (posisi ke-" + (i + 1) + ")");
                ditemukan = true; // Menandakan bahwa ada buku yang ditemukan
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku yang cocok dengan kata kunci tersebut."); // Jika tidak ditemukan buku yang cocok
        }
    }
}
    public static void main(String[] args) {
        
    // Menentukan kapasitas stack
    int kapasitas = 6;  // Menentukan berapa banyak buku yang bisa disimpan dalam stack
    inisialisasiStack(kapasitas); // Inisialisasi stack dengan kapasitas 6

    // Menambahkan beberapa buku ke tumpukan
    push("Pemrograman Java Dasar");
    push("Struktur Data");
    push("Basis Data");
    push("Algoritma dan Pemrograman");
    push("Jaringan Komputer");
    push("Sistem Operasi");

    System.out.println();
    tampilkanBuku(); // Menampilkan semua buku yang ada dalam stack
    
    System.out.println();
    peek(); // Menampilkan buku teratas dalam stack

    System.out.println();
    pop(); // Mengambil satu buku dari atas stack

    System.out.println();
    tampilkanBuku(); // Menampilkan stack setelah melakukan pop
    
    System.out.println();
    peek(); // Menampilkan buku teratas setelah pop

    System.out.println();
    // Mencoba fitur pencarian (berdasarkan kata kunci sebagian)
    cariBuku("data");  // Harus ketemu "Struktur Data" dan "Basis Data"

    System.out.println();
    cariBuku("python"); // Tidak ada yang ketemu
    }
}