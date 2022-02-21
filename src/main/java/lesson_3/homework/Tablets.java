package lesson_3.homework;

public class Tablets extends Category implements Element {
    private int batteryCapacity;
    private float diagonal;
    private int RAM;
    private String OS;
    private String GPS;

    public Tablets(String iconDescription, String name, int batteryCapacity, float diagonal, int RAM, String OS) {
        super(iconDescription, name);
        this.batteryCapacity = batteryCapacity;
        this.diagonal = diagonal;
        this.RAM = RAM;
        this.OS = OS;

    }

    public Tablets(String iconDescription, String name, int batteryCapacity, float diagonal, int RAM, String OS, String GPS) {
        super(iconDescription, name);
        this.batteryCapacity = batteryCapacity;
        this.diagonal = diagonal;
        this.RAM = RAM;
        this.OS = OS;
        this.GPS = GPS;
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

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Характеристики планшета:" +
                " категория '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", ёмкость аккумулятора " + batteryCapacity + " mAh " +
                ", диагональ " + diagonal + " d " +
                ", оперативная память " + RAM + "gb" +
                ", OS '" + OS + '\'' +
                ", наличие GPS '" + GPS + '\'';
    }

    @Override
    public String getType() {
        return "Электронный стилус для рисования";
    }

    @Override
    public void click() {
        System.out.println("Электронный стилус включен/выключен");
    }
}
