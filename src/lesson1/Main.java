package lesson1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char l='*';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(l);
            }
            System.out.println();
        }

        System.out.println("//////////////");
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println("///////////");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*(i-1); j++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}