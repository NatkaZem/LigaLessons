package lesson_3.homework;

public abstract class Category {
    protected String iconDescription;
    protected String name;

    public Category(String iconDescription,String name){
        this.iconDescription = iconDescription;
        this.name = name;
    }

    public abstract void open();
}
