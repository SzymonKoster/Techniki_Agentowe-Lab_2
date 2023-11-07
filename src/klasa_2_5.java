import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class klasa_2_5 extends Agent {

    protected void setup() {
        System.out.println("Agent " + getLocalName() + " startuje.");

        addBehaviour(new CyclicBehaviour() {
            public void action() {
                System.out.println("cyclic 1");
                block(1000);
            }
        });

        addBehaviour(new CyclicBehaviour() {
            public void action() {
                System.out.println("cyclic 2");
                block(1000);
            }
        });
    }
}
