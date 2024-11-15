package UpdatePractice.Composite;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");
        File file5 = new File("file5.txt");

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Folder folder3 = new Folder("folder3");

        //add files to folder
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        folder2.addComponent(folder1);
        folder2.addComponent(file3);
        folder2.addComponent(file4);

        folder3.addComponent(folder2);
        folder3.addComponent(file5);

        folder3.details();
    }
}
