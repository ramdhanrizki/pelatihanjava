package Kasus1;

public class GenericObject{
    private Object data1;
    private Object data2;
    private Object temp;

    //buat getter setter untuk masing-masing data

    public Object getData1() {
        return data1;
    }

    public void setData1(Object data1) {
        this.data1 = data1;
    }

    public Object getData2() {
        return data2;
    }

    public void setData2(Object data2) {
        this.data2 = data2;
    }

    public Object getTemp() {
        return temp;
    }

    public void setTemp(Object temp) {
        this.temp = temp;
    }

    //lengkapi generic method untuk tukar data1 dengan data2
    public void tukarData(){
        temp = data1;
        data1 = data2;
        data2 = temp;
    }
}