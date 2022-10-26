public class ClassesAndOdject {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setAge(-4);
        person1.setName("");
        System.out.println("Enter value in the main method " + person1.getName());
        System.out.println("Enter value in the main method " + person1.getAge());
    }
}


class Person {
    private String name;
    private int age;

    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("You entered an empty name!");
        }else {
            name = username;
        }
    }

    public String getName(){
        return  name;
    }

    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println("Error in your choice");
        }else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    void  speak(){
        for (int i = 0; i < 3; i++)
        System.out.println("My name "+ name + ", i am "+ age+ "  years old.");
    }
    void sayHello (){
        System.out.println("Hello");
    }
}

