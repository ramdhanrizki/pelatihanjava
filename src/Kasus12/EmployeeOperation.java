package Kasus12;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmployeeOperation {

    public void printNIP(String NIP) {
        //buat instance dari kelas Employee
        Employee pegawai = new Employee();


        //set NIP untuk objek employee yang telah dibuat
        pegawai.setNIP(NIP);
        try{
            System.out.println(pegawai.getNIP());
        }catch (NullPointerException ex){
            System.out.println("Null terdeteksi");
        }
    }
}