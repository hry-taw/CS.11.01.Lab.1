import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt()  ;
        System.out.println(age + "-year olds should read at least " + (100 - age) + " pages before giving up on a book.");
    }
}