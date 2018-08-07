public class Visitor {

    private String name;
    private int age;
    private int height;
    private int money;

    public Visitor(String name, int age, int height, int money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public int getMoney(){
        return money;
    }
}
