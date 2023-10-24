import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;

public class klasa_5 extends klasa_1 {
    protected void setup() {
        super.setup();
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                Scanner scanner = new Scanner(System.in);
                int number;
                do {
                    System.out.println("Wprowadź liczbę całkowitą:");
                    number = scanner.nextInt();
                    if (number >= 0) {
//                        System.out.println("Podano liczbę całkowitą");
                    }
                } while (number >= 0);
//                System.out.println("Podano liczbę ujemną");
                removeBehaviour(this);
            }
        });
    }
}