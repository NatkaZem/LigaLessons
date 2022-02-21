package lesson_3.homework;

public class Smartphones extends Category implements Element {
    private int batteryCapacity;
    private float diagonal;
    private int RAM;
    private String OS;
    private String NFC;

    public Smartphones(String iconDescription, String name, int batteryCapacity, float diagonal, int RAM, String OS) {
        super(iconDescription, name);
        this.batteryCapacity = batteryCapacity;
        this.diagonal = diagonal;
        this.RAM = RAM;
        this.OS = OS;
    }

    public Smartphones(String iconDescription, String name, int batteryCapacity, float diagonal, int RAM, String OS, String NFC) {
        super(iconDescription, name);
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.diagonal = diagonal;
        this.RAM = RAM;
        this.NFC = NFC;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getNFC() {
        return NFC;
    }

    public void setNFC(String NFC) {
        this.NFC = NFC;
    }


    @Override
    public String toString() {
        return "Характеристики смартфона:" +
                " категория '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", ёмкость аккумулятора " + batteryCapacity + " mAh " +
                ", диагональ " + diagonal + " d " +
                ", оперативная память " + RAM + " gb" +
                ", операционная система '" + OS + '\'' +
                ", наличие NFC '" + NFC + '\'';
    }

    @Override
    public String getType() {
        return "Возможность бесконтактной оплаты NFC";
    }

    @Override
    public void click() {
        System.out.println("Включить/выключить модуль NFC");
    }
}
