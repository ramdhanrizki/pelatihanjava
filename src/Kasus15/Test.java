package Kasus15;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException  {
        //buat instance EmployeeOperation
        EmployeeOperation pegawai = new EmployeeOperation();

        //panggil method readFile()

        pegawai.readFile();
        new IOException("gagal membaca file");


    }
}