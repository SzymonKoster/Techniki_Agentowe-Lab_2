import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class ag_odb extends Agent {

    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {
                ACLMessage msg = myAgent.receive();
                if (msg != null) {

                    System.out.println("Otrzymano wiadomość: " + msg.getContent());

                    ACLMessage reply = msg.createReply();

                    if (msg.getPerformative() == ACLMessage.REQUEST) {
                        reply.setPerformative(ACLMessage.INFORM);
                        reply.setContent("wykonałem");
                    } else if (msg.getPerformative() == ACLMessage.CFP) {
                        reply.setPerformative(ACLMessage.REQUEST);
                        reply.setContent("raz jeszcze");
                    } else {
                        reply.setPerformative(ACLMessage.NOT_UNDERSTOOD);
                        reply.setContent("Nie rozumiem wiadomości");
                    }

                    myAgent.send(reply);
                } else {
                    block();
                }
            }
        });
    }
}
