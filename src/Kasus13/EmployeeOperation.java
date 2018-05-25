package Kasus13;

public class EmployeeOperation {

    public void printNIPasInteger(String NIP) {
        //buat instance dari kelas Employee
        Employee pegawai = new Employee();
        //set NIP untuk objek employee yang telah dibuat
        pegawai.setNIP(NIP);
        //buat try catch untuk mengecek apabila NIP-nya kosong dan mengandung huruf
        try{
            System.out.println(pegawai.getNIP());
        }catch (NullPointerException ex){
            System.out.println("Null terdeteksi");
        }catch (NumberFormatException ex){
            System.out.println("NIP tidak boleh mengandung huruf");
        }
        //jika input NIP tidak kosong dan tidak mengandung huruf maka tampilkan NIP-nya
        //apabila kosong, tampilkan "Null terdeteksi"
        //apabila mengandung huruf, tampilkan "NIP tidak boleh mengandung huruf"
        //input NIP didapat dari file benar.txt dan salah.txt (jika ingin coba run masukkan nama file dari salah satu file tersebut)


    }
}