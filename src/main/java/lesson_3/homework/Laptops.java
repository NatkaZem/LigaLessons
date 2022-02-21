package lesson_3.homework;

public class Laptops extends Category {
    private String CPU;
    private int sizeSSD;
    private int RAM;
    private String videoCard;
    private String OS;

    public Laptops(String iconDescription, String name, String CPU, int sizeSSD, int RAM, String videoCard, String OS) {
        super(iconDescription, name);
        this.CPU = CPU;
        this.sizeSSD = sizeSSD;
        this.RAM = RAM;
        this.videoCard = videoCard;
        this.OS = OS;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getSizeSSD() {
        return sizeSSD;
    }

    public void setSizeSSD(int sizeSSD) {
        this.sizeSSD = sizeSSD;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Характеристики ноутбука:" +
                " категория '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", процессор '" + CPU + '\'' +
                ", размер жесткого диска " + sizeSSD + " gb " +
                ", оперативная память " + RAM + " gb " +
                ", наличие видеокарты '" + videoCard + '\'' +
                ", операционная система '" + OS + '\'';
    }
}
