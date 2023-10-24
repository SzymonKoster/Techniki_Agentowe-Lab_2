import jade.core.behaviours.OneShotBehaviour;

public class klasa_7 extends klasa_4 {
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                System.out.println("pierwsze");
            }
        });
        super.setup();
        getSequentialBehaviour().addSubBehaviour(new OneShotBehaviour() {
            public void action() {
                System.out.println("drugie");
            }
        });
    }
}
