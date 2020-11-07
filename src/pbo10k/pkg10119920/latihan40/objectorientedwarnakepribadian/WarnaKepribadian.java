/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan40.objectorientedwarnakepribadian;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Orang{
    public String nama;
    
    public void nama(){
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
    }
}

class Warna{
    
    public String namaWarna;
    public String normal = "\u001b[0m";
    public String merah = "\u001b[31m";
    public String hijau = "\u001b[32m";
    public String kuning = "\u001b[33m";
    public String biru = "\u001b[34m";
    public String ungu = "\u001b[35m";
    
    public void artiWarna(){
    switch (namaWarna) {
            case "MERAH":
                
                System.out.println("Warna Favoritmu adalah " + merah + namaWarna + normal);
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
            case "HIJAU":
                System.out.println("Warna Favoritmu adalah " + hijau + namaWarna + normal);
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3 Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "KUNING":
                System.out.println("Warna Favoritmu adalah " + kuning + namaWarna + normal);
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;
            case "BIRU":
                System.out.println("Warna Favoritmu adalah " + biru + namaWarna + normal);
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case "UNGU":
                System.out.println("Warna Favoritmu adalah " + ungu + namaWarna + normal);
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh,");
                break;
            default:
                System.out.println("Oops.. Belum terindentifikasi");
                break;
    }
    }
}

public class WarnaKepribadian {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Orang o = new Orang();
        Warna w = new Warna();
        
        System.out.println(w.merah + "YUK " + w.hijau + "CEK " + w.kuning + "KEPRIBADIAN " + "\u001b[36m DARI " + w.ungu + "WARNA " + w.biru + "FAVORITMU" + w.normal);
        System.out.println();
        System.out.println("\u001b[41m \u001b[37m" + "         MERAH        " + w.normal);
        System.out.println("\u001b[42m \u001b[37m" + "         HIJAU        " + w.normal);
        System.out.println("\u001b[43m \u001b[37m" + "         KUNING       " + w.normal);
        System.out.println("\u001b[44m \u001b[37m" + "         BIRU         " + w.normal);
        System.out.println("\u001b[45m \u001b[37m" + "         UNGU         " + w.normal);
        System.out.println();
        System.out.print("PILIH WARNA FAVORITMU : ");
        w.namaWarna = input.next();
        w.namaWarna = w.namaWarna.toUpperCase();
        System.out.print("NAMA KAMU : ");
        o.nama = input.next();
        o.nama = o.nama.toUpperCase();
        System.out.println();
        o.nama();
        w.artiWarna();
    }
}