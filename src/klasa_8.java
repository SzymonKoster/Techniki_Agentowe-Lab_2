import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;
import jade.core.behaviours.Behaviour;

public class klasa_8 extends klasa_1 {
    private Behaviour duzyTickBehaviour;

    protected void setup() {
        super.setup();
        addBehaviour(new TickerBehaviour(this, 2000) {
            protected void onTick() {
                System.out.println("mały tick");
            }
        });

        duzyTickBehaviour = new TickerBehaviour(this, 5000) {
            protected void onTick() {
                System.out.println("duży tick");
            }
        };
        addBehaviour(duzyTickBehaviour);

        addBehaviour(new WakerBehaviour(this, 50000) {
            protected void onWake() {
                removeBehaviour(duzyTickBehaviour);
            }
        });
        addBehaviour(new WakerBehaviour(this, 100000) {
            protected void onWake() {
                doDelete();
            }
        });
    }
}
