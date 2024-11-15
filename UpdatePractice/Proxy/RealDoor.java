package UpdatePractice.Proxy;

//REAL SUBJECT
public class RealDoor implements Door {
    @Override
    public void open() {
        System.out.println("Opening the door") ;
    }
}
