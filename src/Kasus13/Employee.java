package Kasus13;

public class Employee {
    private String NIP;

    public int getNIP() {
        return Integer.valueOf(NIP.trim());
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
}