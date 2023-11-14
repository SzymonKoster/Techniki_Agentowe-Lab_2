import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class ag_pl extends Agent {

    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {
                MessageTemplate mt = MessageTemplate.MatchLanguage("polski");
                ACLMessage msg = myAgent.receive(mt);

                if (msg != null) {
                    System.out.println("Otrzymano wiadomość: " + msg.getContent());
                } else {
                    block();
                }
            }
        });
    }
}
