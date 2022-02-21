package lesson_3.homework;

public class SmartWatches extends Category implements Element, GsmModule {
    private int batteryCapacity;
    private int weight;
    private float diagonal;
    private String navigation;

    public SmartWatches(String iconDescription, String name, int batteryCapacity, int weight, float diagonal) {
        super(iconDescription, name);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
        this.diagonal = diagonal;
    }

    public SmartWatches(String iconDescription, String name, int batteryCapacity, int weight, float diagonal, String navigation) {
        super(iconDescription, name);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
        this.diagonal = diagonal;
        this.navigation = navigation;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public String getNavigation() {
        return navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }

    @Override
    public String toString() {
        return "Характеристики смартчасов:" +
                " категория '" + iconDescription + '\'' +
                ", название '" + name + '\'' +
                ", емкость аккумулятора " + batteryCapacity + " mAh " +
                ", вес " + weight + " g " +
                ", диагональ " + diagonal + " d " +
                ", наличие навигации '" + navigation + '\'';
    }

    @Override
    public String getType() {
        return "Возможность отвечать на звонки";
    }

    @Override
    public void click() {
        System.out.println("Ответить на звонок");
    }
}
