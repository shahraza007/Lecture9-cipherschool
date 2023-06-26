

class Car{
    String name;
    String color;
    int year;
    int maxSpeed;
    void acceleration(){
        System.out.println("Car is accelerating");

    }
}
public class Lecture7_couterFlow {
    public static void main(String[] args) {
        Car polo=new Car();

        polo.name="polo";
        polo.color="red";
        polo.year=2016;
        polo.maxSpeed=120;

        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);




    }
}
