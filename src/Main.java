import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for (int C=1; C<=N;C++){
            if (C%2!=0){
                System.out.println(C);
            }
        }
        sc.close();
    }
}