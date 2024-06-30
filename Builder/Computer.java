package Builder;

public class Computer {
    //required parameter
    private String HDD;
    private String RAM;

    //optional
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD(){
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }
    public boolean isGraphicsCardEnabled(){
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled(){
        return  isBluetoothEnabled;
    }
}
