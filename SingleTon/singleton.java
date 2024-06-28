package SingleTon;

public class singleton {
    public static void main(String args[]) {
        Abc obj1 = new Abc();
        Abc obj2 = new Abc();
    }
}

class Abc{
    public Abc(){
        //lets have a public constructor
    }
}