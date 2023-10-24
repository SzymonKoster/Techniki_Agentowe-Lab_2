import jade.core.behaviours.SequentialBehaviour;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_4 extends klasa_1 {
    private SequentialBehaviour seq;

    protected void setup() {
        super.setup();
        seq = new SequentialBehaviour();
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
        addBehaviour(seq);
    }

    public SequentialBehaviour getSequentialBehaviour() {
        return seq;
    }
}
