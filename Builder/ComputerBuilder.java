package Builder;

public class ComputerBuilder {
    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String HDD, String RAM){
        this.HDD=HDD;
        this.RAM=RAM;
    }
    public ComputerBuilder setGraphicsCArdEnabled(boolean isGraphicsCArdEnabled){
        this.isGraphicsCardEnabled = isGraphicsCArdEnabled;
        return this;
    }
    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
        this.isBluetoothEnabled=isBluetoothEnabled;
        return this;
    }
    public Computer build(){
        return new Computer(this);
    }
}
