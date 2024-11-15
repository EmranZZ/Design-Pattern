package UpdatePractice.Composite;

public class File implements FileSystemComponent{
    private String name;
    public File(String name){
        this.name=name;
    }
    @Override
    public void details() {
        System.out.println("File: " + name);
        //or
        //return "File: " + name;
    }
}
