package Kasus4;

import java.util.LinkedList;

public class CobaLinkedList{

    public static void main(String[] args){
        //buat linkedlist dengan nama pecahan untuk
        //menampung bilangan pecahan
        LinkedList<Double> pecahan = new LinkedList<>();

        //tambahkan angka 10.05; 12.78; 5.76; 4.58; 20.87 di linkedlist
        pecahan.push(20.87);
        pecahan.push(4.58);
        pecahan.push(5.76);
        pecahan.push(12.78);
        pecahan.push(10.05);


        //munculkan angka yang ada di linked list menggunakan foreach
        for (Double item:pecahan) {
            System.out.println(item);
        }

    }
}