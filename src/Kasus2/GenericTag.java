package Kasus2;

public class GenericTag<E> {
    private E data1;
    private E data2;
    private E temp;

    public E getData1() {
        return data1;
    }

    public void setData1(E data1) {
        this.data1 = data1;
    }

    public E getData2() {
        return data2;
    }

    public void setData2(E data2) {
        this.data2 = data2;
    }

    public E getTemp() {
        return temp;
    }

    public void setTemp(E temp) {
        this.temp = temp;
    }

    public void tukarData(){
        temp = data1;
        data1 = data2;
        data2 = temp;
    }
}
