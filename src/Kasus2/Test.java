package Kasus2;

public class Test{

    public static void main(String[] args){
        //buat instance dari kelas GenericTag sesuai dengan kebutuhan kasus dan
        //lengkapi sintaks pada file ini sehingga menghasilkan output yang sesuai
        GenericTag<Integer> gObject = new GenericTag<Integer>();
        gObject.setData1(5);
        gObject.setData2(3);
        gObject.tukarData();
        System.out.println(gObject.getData1());
        System.out.println(gObject.getData2());

        GenericTag<String> gObject2 = new GenericTag<>();
        gObject2.setData1("Budi");
        gObject2.setData2("Andi");
        gObject2.tukarData();
        System.out.println(gObject2.getData1());
        System.out.println(gObject2.getData2());
    }
}