package car;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//                Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
//                Если все числа равны, выведи любое из них.

public class LogicalOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение: ");
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        if((n3 >= n2 && n3 <= n1) || (n3 <= n2 && n3 >= n1)){
            System.out.println(n3);
        }else if((n2 >= n3 && n2 <= n1) || (n2 <= n3 && n2 >= n1)){
            System.out.println(n2);
        }else{
            System.out.println(n1);
        }
    }
}

// Решение у нас есть 3 введенных числа: если ((число3 >= числа2 и число3 <= числа1) или (число3 <= числа2 и число3 >= чилса1)){
// Выводим числа 3, ибо оно среднее, и поскольку все условия выше сработали верно.}
// Else if: если дальше (( число 2 >= числа3 и число2 <= числа1) или (число2 <= числа3 и число2 >= числа1){
// Вводим число 2, ибо оно среднее, и поскольку все условия выше сработали верно.}
// Else { Выводим мы числа 1 если те 2 не прошли проверку}
// Чтобы было наглядно
// {число1  число2    число3
//    4        3         5
//    5        4         3
//    3        5         4
//                          }
