package UpdatePractice.Proxy;

public class client {
    public static void main(String[] args) {
        //create the real door
        RealDoor realdoor = new RealDoor();

        //creating guard
        SecurityGuard guard = new SecurityGuard(realdoor);

        guard.open("lawyer");
        guard.open("student");
    }
}
