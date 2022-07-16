import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, u,h;
        System.out.print("Lutfen dik kenarlari giriniz; " );
        a= input.nextDouble();
        b= input.nextDouble();
        c = Math.sqrt (a*a + b*b);
        u = a+b+c;
        h = (a*b)/2;
        System.out.println("Hipotenus: " + c);
        System.out.println("Ucgenin cevresi; " + u );
        System.out.print("Alani;" + h);



    }
}