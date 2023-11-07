import jade.core.Agent;
import jade.core.behaviours.SequentialBehaviour;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_2_4 extends Agent {

    protected void setup() {
        SequentialBehaviour sequentialBehaviour = new SequentialBehaviour();

        for (int i = 0; i < 3; i++) {
            sequentialBehaviour.addSubBehaviour(new OneShotBehaviour() {
                public void action() {
                    System.out.println("pierwszy krok");
                }
            });
            sequentialBehaviour.addSubBehaviour(new OneShotBehaviour() {
                public void action() {
                    System.out.println("drugi krok");
                }
            });
            sequentialBehaviour.addSubBehaviour(new OneShotBehaviour() {
                public void action() {
                    System.out.println("trzeci krok");
                }
            });
        }

        addBehaviour(sequentialBehaviour);
    }
}
