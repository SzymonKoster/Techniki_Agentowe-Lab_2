import jade.core.Agent;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.SequentialBehaviour;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_2_3 extends Agent {

    protected void setup() {
        ParallelBehaviour parallelBehaviour = new ParallelBehaviour();

        for (int i = 0; i < 3; i++) {
            SequentialBehaviour seq = new SequentialBehaviour();
            seq.addSubBehaviour(new OneShotBehaviour() {
                public void action() {
                    System.out.println("pierwszy krok");
                }
            });
            seq.addSubBehaviour(new OneShotBehaviour() {
                public void action() {
                    System.out.println("drugi krok");
                }
            });
            seq.addSubBehaviour(new OneShotBehaviour() {
                public void action() {
                    System.out.println("trzeci krok");
                }
            });

            parallelBehaviour.addSubBehaviour(seq);
        }

        addBehaviour(parallelBehaviour);
    }
}
