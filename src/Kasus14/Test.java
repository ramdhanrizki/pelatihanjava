package Kasus14;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //buat array String dari NIP dengan panjang 3
        String nip[] = new String[3];

        //isi NIP dengan nilai 10, 11, dan 12
        nip[0] = "10";
        nip[1] = "11";
        nip[2] = "12";

        //buat instance dari scanner
        Scanner sc = new Scanner(System.in);
        Integer n = 0;
        //buat try catch untuk mengecek apakah indeks dari array yang diinputkan tidak keluar dari batas
        try {
             n = sc.nextInt();
             System.out.println(nip[n]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Akses array ke indeks yang salah");
        }finally {
            for (String item:nip) {
                System.out.println(item);
            }
        }
        //jika indeks tidak keluar batas tampilkan NIP sesuai dengan indeks yang diinputkan oleh scanner
        //jika indeks keluar batas maka tampilkan "Akses array ke indeks yang salah"
        //tambahkan blok finally untuk menampilkan semua isi dari array


    }
}