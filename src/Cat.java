import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[5];
        numbers [0] = 10;
        String[] strings = new String[3];
        strings [0] = "Hello";
        strings [1] = "Bue";
        strings [2] = "Java";

        for (String string:strings){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x: numbers1){
            sum = sum+x;
            System.out.println();
            System.out.println(sum);
        }


        int value = 0;
        String s = "nulls";
        System.out.println(s);

    }
}

//Сделать пару примеров по массивам, не забыть