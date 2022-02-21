package lesson_3.homework;

public class GamesAndConsols extends Category implements Element {
    private String colour;
    private String producingCountry;

    public GamesAndConsols(String iconDescription, String name, String colour, String producingCountry) {
        super(iconDescription, name);
        this.colour = colour;
        this.producingCountry = producingCountry;
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

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }


    @Override
    public String toString() {
        return "Характеристики игр и консолей:" +
                " категория '" + iconDescription + '\'' +
                ", название'" + name + '\'' +
                ", цвет '" + colour + '\'' +
                ", страна-производитель '" + producingCountry + '\'';
    }

    @Override
    public String getType() {
        return "Наличие игрового пистолета";
    }

    @Override
    public void click() {
        System.out.println("Игровой пистолет включен/выключен");
    }
}
