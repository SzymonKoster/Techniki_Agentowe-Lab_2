import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import java.util.Random;

public class ag_wys_odb extends Agent {

    private boolean isDone = false;

    protected void setup() {
        addBehaviour(new Behaviour() {
            @Override
            public void action() {
                Random rand = new Random();
                int choice = rand.nextInt(2);

                ACLMessage msg = new ACLMessage(choice == 0 ? ACLMessage.CFP : ACLMessage.REQUEST);
                msg.addReceiver(new jade.core.AID("BOT", jade.core.AID.ISLOCALNAME));
                msg.setContent("Wiadomość testowa");
                send(msg);

                ACLMessage reply = blockingReceive();
                System.out.println("Otrzymano odpowiedź: " + reply.getContent());

                if (reply.getPerformative() == ACLMessage.INFORM) {
                    isDone = true;
                    myAgent.doDelete();
                }
            }

            @Override
            public boolean done() {
                return isDone;
            }
        });
    }
}
