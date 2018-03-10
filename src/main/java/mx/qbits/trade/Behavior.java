package mx.qbits.trade;

import java.util.List;
import rx.Observable;

public abstract class Behavior {
    private Observable<Operacion> observable = null;

    public void loadData(List<Operacion> operaciones) {
        observable = Observable.from(operaciones);
    }
    
    // Suscribe el observable a la operación de filtro:
    public void setValorActual(Moneda coin, double valor) {
        System.out.println("El valor de " + coin + " ha cambiado a: " + valor);
        observable.subscribe(op -> customBehavior(op, coin, valor));
    }

    protected abstract void customBehavior(Operacion op, Moneda coin, double valor);

}