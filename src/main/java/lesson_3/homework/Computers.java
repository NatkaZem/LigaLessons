package lesson_3.homework;

public class Computers extends Category {
    private String CPU;
    private int sizeSSD;
    private int RAM;
    private String videoCard;

    public Computers(String iconDescription, String name, String CPU, int sizeSSD, int RAM) {
        super(iconDescription, name);
        this.CPU = CPU;
        this.RAM = RAM;
        this.sizeSSD = sizeSSD;
    }

    public Computers(String iconDescription, String name, String CPU, int sizeSSD, int RAM, String videoCard) {
        super(iconDescription, name);
        this.CPU = CPU;
        this.RAM = RAM;
        this.sizeSSD = sizeSSD;
        this.videoCard = videoCard;
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

    @Override
    public String toString() {
        return "Характеристики системного блока:" +
                " категория  '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", процессор  '" + CPU + '\'' +
                ", размер жесткого диска  " + sizeSSD + " gb" +
                ", оперативная память  " + RAM + " gb" +
                ", видеокарта  '" + videoCard + '\'';
    }
}
