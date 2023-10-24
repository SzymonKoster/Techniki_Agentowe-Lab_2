import jade.core.behaviours.OneShotBehaviour;

public class klasa_2 extends klasa_1 {
    protected void setup() {
        super.setup();
        addBehaviour(new OneShotBehaviour(this) {
            public void action() {
                System.out.println("wykonuję");
            }
        });
    }
}
