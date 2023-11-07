import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import java.util.Random;

public class klasa_1_2 extends Agent {

    private Random random = new Random();

    private int stateA() {
        System.out.println("A");
        return 1;
    }

    private int stateB() {
        System.out.println("B");
        int randomB = random.nextInt(2);
        return randomB;
    }

    private int stateC() {
        System.out.println("C");
        return 1;
    }

    private int stateD() {
        System.out.println("D");
        int randomD = random.nextInt(2);
        return randomD;
    }

    private int stateE() {
        System.out.println("E");
        return 0;
    }

    protected void setup() {

        addBehaviour(new Behaviour() {
            private int step = 0;

            @Override
            public void action() {
                switch (step) {
                    case 0:
                        stateA();
                        step = 1;
                        break;
                    case 1:
                        if (stateB() == 1) {
                            step = 2;
                        } else {
                            step = 3;
                        }
                        break;
                    case 2:
                        stateC();
                        step = 3;
                        break;
                    case 3:
                        if (stateD() == 0) {
                            step = 0;
                        } else {
                            step = 4;
                        }
                        break;
                    case 4:
                        stateE();
                        step = 5;
                        break;
                }
            }

            @Override
            public boolean done() {
                return step == 5;
            }
        });
    }
}
