package car;

public class Car {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    String color;

    public Car (String name, int yearOfProduction, int price, int weight, String color){
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;

        System.out.println(name);
    }

    public Car(String name, int yearOfProduction, int price) {

    }


} 
