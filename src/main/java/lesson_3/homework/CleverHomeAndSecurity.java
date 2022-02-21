package lesson_3.homework;

public class CleverHomeAndSecurity extends Category {
    private String colour;
    private int weight;
    private String producingCountry;
    private String typeElement;
    private int qualityOfVideo;

    public CleverHomeAndSecurity(String iconDescription, String name, String colour, int weight, String producingCountry, String typeElement) {
        super(iconDescription, name);
        this.colour = colour;
        this.weight = weight;
        this.producingCountry = producingCountry;
        this.typeElement = typeElement;
    }

    public CleverHomeAndSecurity(String iconDescription, String name, String colour, int weight, String producingCountry, int qualityOfVideo) {
        super(iconDescription, name);
        this.colour = colour;
        this.weight = weight;
        this.producingCountry = producingCountry;
        this.qualityOfVideo = qualityOfVideo;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getTypeElement() {
        return typeElement;
    }

    public void setTypeElement(String typeElement) {
        this.typeElement = typeElement;
    }

    public int getQualityOfVideo() {
        return qualityOfVideo;
    }

    public void setQualityOfVideo(int qualityOfVideo) {
        this.qualityOfVideo = qualityOfVideo;
    }

    @Override
    public String toString() {
        return "Характеристики оборудования для умного дома:" +
                " категория'" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", цвет '" + colour + '\'' +
                ", вес ' " + weight + " g " + '\'' +
                " страна-производитель '" + producingCountry + '\'' +
                ", тип " + typeElement + '\'' +
                ", качество видео " + qualityOfVideo + " p " + '\'';
    }
}
