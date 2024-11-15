package UpdatePractice.Proxy;

//PROXY CLASS
public class SecurityGuard implements Door {
    private RealDoor realdoor;
    private String person;

    public SecurityGuard(RealDoor realdoor){
        this.realdoor=realdoor;
    }

    public boolean checkAccess(String person){
        this.person=person;
        //only student can open the door
        String author;
        author = "student";
        return author.equalsIgnoreCase(person);
    }

    @Override
    public void open() {
        System.out.println("Access denied");
    }

    public void open(String person){
        this.person= person;
        if(checkAccess(person)) realdoor.open();

        else System.out.println("Access denied43");
    }
}
