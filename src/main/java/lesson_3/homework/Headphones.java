package lesson_3.homework;

public class Headphones extends Category {
    private String construction;
    private String producingСountry;

    public Headphones(String iconDescription, String name, String construction, String producingСountry) {
        super(iconDescription, name);
        this.construction = construction;
        this.producingСountry = producingСountry;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getProducingСountry() {
        return producingСountry;
    }

    public void setProducingСountry(String producingСountry) {
        this.producingСountry = producingСountry;
    }

    @Override
    public String toString() {
        return "Характеристики наушников:" +
                " категория '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", конструкция наушников '" + construction + '\'' +
                ", страна-производитель '" + producingСountry + '\'';
    }
}
