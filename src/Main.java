import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float x, y, sum,sub;
        Scanner num = new Scanner(System.in);
        System.out.println("Type a number:");
        x =  num.nextInt();

        System.out.println("Type another number:");
        y =  num.nextInt();

        sum = x + y;
        System.out.println("Sum is: " + sum);

        sub = x - y;
        System.out.println("sub is : " + sub);

    }
}