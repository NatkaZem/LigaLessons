package lesson_3.homework;

public class TVSets extends Category {
    private float diagonal;
    private int amountHDMI;
    private String SmartTV;

    public TVSets(String iconDescription, String name, float diagonal, int amountHDMI) {
        super(iconDescription, name);
        this.diagonal = diagonal;
        this.amountHDMI = amountHDMI;
    }

    public TVSets(String iconDescription, String name, float diagonal, int amountHDMI, String SmartTV) {
        super(iconDescription, name);
        this.diagonal = diagonal;
        this.amountHDMI = amountHDMI;
        this.SmartTV = SmartTV;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getAmountHDMI() {
        return amountHDMI;
    }

    public void setAmountHDMI(int amountHDMI) {
        this.amountHDMI = amountHDMI;
    }

    public String getSmartTV() {
        return SmartTV;
    }

    public void setSmartTV(String smartTV) {
        SmartTV = smartTV;
    }

    @Override
    public String toString() {
        return "Характеристики телевизора:" +
                " категория' " + iconDescription + '\'' +
                ", название' " + name + '\'' +
                ", диагональ  " + diagonal + " d " +
                ", количество разъемов HDMI " + amountHDMI +
                ", наличие SmartTV '" + SmartTV + '\'';
    }
}
