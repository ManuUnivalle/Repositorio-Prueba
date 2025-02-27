import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número 1: ");
        int number_1 = sc.nextInt();
        System.out.println("Ingrese número 1: ");
        int number_2 = sc.nextInt();

        for (int i = 0; i < 20; i++){
            int random = (int)Math.floor((Math.random()*(number_1-number_2)+number_2));
            System.out.println(random);
        }    
        sc.close();
    }
}//:)
