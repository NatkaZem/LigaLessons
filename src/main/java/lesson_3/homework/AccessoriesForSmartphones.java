package lesson_3.homework;

public class AccessoriesForSmartphones extends Category {
    private String colour;
    private String material;

    public AccessoriesForSmartphones(String iconDescription, String name, String colour, String material) {
        super(iconDescription, name);
        this.colour = colour;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Характеристики аксессуара для смартфона:" +
                ", категория '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", цвет '" + colour + '\'' +
                ", материал '" + material + '\'';
    }

}
