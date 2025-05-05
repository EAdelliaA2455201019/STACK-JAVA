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

public class Studi_Kasus_Stack {
    public static void main(String[] args) {
        
        
        // Mendefinisikan sebuah kalimat yang akan dibalik urutan katanya
        String kalimat = "Saya sedang mengikuti kuliah Struktur Data";

        // Membuat Objek Stack untuk menyimpan kata-kata
        // Stack digunakan karena sesuai dengan konsep LIFO (Last In First Out)
        // Elemen yang terakhir dimasukkan adalah yang pertama dikeluarkan
        Stack<String> stack = new Stack<>(); 

        // Pisahkan kalimat menjadi kata-kata (berdasarkan spasi)
        // split() digunakan untuk memisahkan string berdasarkan pemisah tertentu (spasi dalam hal ini)
        String[] kata = kalimat.split(" "); // Hasilnya adalah array kata ["Saya", "sedang", "mengikuti", "kuliah", "Struktur", "Data"]

        // Menyimpan setiap kata dalam stack
        // Kata pertama akan berada di bawah, dan kata terakhir di atas
        for (String k : kata) {
            stack.push(k); // push() digunakan untuk menambahkan elemen ke stack (tumpukan)
        }

        // Menampilkan kalimat yang sudah dibalik urutan katanya
        System.out.print("Kalimat Terbalik: ");
        
        // Selama stack masih memiliki elemen (isEmpty() mengembalikan false jika stack tidak kosong)
        while (!stack.isEmpty()) {  
            // pop() digunakan untuk mengambil elemen paling atas dari stack
            // Kata yang terakhir dimasukkan (terletak di atas stack) akan diambil pertama kali
            System.out.print(stack.pop() + " "); 
             }
        }
    }