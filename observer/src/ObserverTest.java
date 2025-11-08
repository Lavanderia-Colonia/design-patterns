import Observer.Log;
import Subject.Finalizacao;
import Subject.Pedido;
import Subject.StatusPedido;
import java.util.Date;

public class ObserverTest {
    public static void Log(){
        Log log = new Log();
        float valorTotal = 100;
        Finalizacao finalizacao = Finalizacao.ENTREGAR;
        Date data = new Date();

        Pedido pedido = new Pedido(valorTotal, finalizacao, data);
        pedido.registerObserver(log);

        pedido.deletePedido();
        pedido.createPedido();
        pedido.changeStatus(StatusPedido.CANCELADO);
        pedido.deletePedido();

        log.getLogs();
    }
}
