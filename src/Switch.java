import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter your age ");
        String age = scanner.nextLine();
        switch (age){
            case "One" :
                System.out.println("You ware born");
                break;
            case "Seven":
                System.out.println("You went to school");
                break;
            case "Eighteen":
                System.out.println("You graduated from high school");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}