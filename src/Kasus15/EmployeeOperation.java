package Kasus15;

//file ini jangan diubah
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeOperation {
    public void readFile() throws IOException {
        BufferedReader br = null;
        String sCurrentLine = null;
        EmployeeOperation employeeOperation = new EmployeeOperation();

        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.next().trim();

        br = new BufferedReader(new FileReader(fileName));
        while ((sCurrentLine = br.readLine()) != null) {
            if ("".equals(sCurrentLine))
                sCurrentLine = null;
            employeeOperation.printNIP(sCurrentLine);
        }
    }

    private void printNIP(String NIP) {
        //buat instance dari kelas satu.Employee
        Employee employee = new Employee();

        //buat try catch untuk mengecek apabila NIP-nya kosong
        //kalau input NIP tidak kosong maka tampilkan NIP-nya
        try {
            employee.setNIP(NIP);
            System.out.println(employee.getNIP());
        } catch (NullPointerException e) {
            System.out.println("Null terdeteksi");
        }
    }
}

