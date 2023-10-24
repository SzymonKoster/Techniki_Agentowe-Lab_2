import jade.core.behaviours.TickerBehaviour;

public class klasa_3 extends klasa_1 {
    protected void setup() {
        super.setup();
        addBehaviour(new TickerBehaviour(this, 1000) {
            protected void onTick() {
                System.out.println("wykonuję");
            }
        });
    }
}
