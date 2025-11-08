package Subject;

import Observer.LogType;
import Observer.Observer;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Pedido implements Subject {

    private static final ArrayList<Observer> observers = new ArrayList<>();
    private long id;
    private float valorTotal;
    private Finalizacao finalizacao;
    private StatusPedido status;
    private Date data;

    public Pedido(float valorTotal, Finalizacao finalizacao, Date data) {
        this.id = -1;
        this.valorTotal = valorTotal;
        this.finalizacao = finalizacao;
        this.status = StatusPedido.EM_ABERTO;
        this.data = data;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(LogType type, String message) {
        for (Observer o : observers) {
            o.update(type, message, new Timestamp(System.currentTimeMillis()));
        }
    }

    public void createPedido() {
        // save to database and assign id
        this.id = 0; //mockup
        this.notifyObservers(LogType.CREATE, "Successfully created Pedido");
    }

    public void changeStatus(StatusPedido status) {
        this.status = status;
        this.notifyObservers(LogType.UPDATE, "Changed status of Pedido to " + status);
    }

    public void deletePedido(){
        if (this.id == -1) {
            this.notifyObservers(LogType.FAILURE, "Failed to delete Pedido");
            return;
        }
        // delete from database
        this.id = -1;
        this.notifyObservers(LogType.DELETE, "Successfully deleted Pedido");
    }
}
