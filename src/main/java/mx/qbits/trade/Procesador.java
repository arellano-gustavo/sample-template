package mx.qbits.trade;

import java.util.List;

public class Procesador extends Behavior {
    private int cont = 0;

    protected void customBehavior(Operacion op, Moneda coin, double valor) {
        if(!op.isProcesada() && op.getDestino().equals(coin)) {
            double proporcion = valor/op.getCostoDestino();
            this.cont++;
            op.setProcesada(true);
            Result res = new Result(this.cont, coin, op.getCostoDestino(), proporcion);
            System.out.println(res.toString());
        }
    }

    public static void main(String[] args) {
        // carga 18 operaciones financieras
        List<Operacion> ops = GeneraOperaciones.loadData(18);
        Procesador p = new Procesador();
        p.loadData(ops);
        p.setValorActual(Moneda.BTC, 9999+Math.random()*9999);
    }

}








/*
// https://codelexems.com/2014/10/18/java-8-lambdas-are-not-just-syntactic-sugars/

private void setValorActual3(String coin, double valor) {
observable.subscribe(new Action1<Operacion>() {
    @Override
    public void call(Operacion op) {
        doit(op, coin, valor);
    }
});

}


Procesos asíncronos
Programación reactiva
Tolerante a fallos
Resilente
Arquitecrtura de microservicios
Inmutable
Load balanced
Distributed
Serverless
Stateless
Single threded
json - oriented
git - oriented
altamente disponible
Design Patterns
Unit Test, TDD, BDD, mockito, cucumber
test framework =docker


*/
