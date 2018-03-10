package mx.qbits.trade;

import java.util.List;
import org.junit.Test;

public class EjemploTest {
    
    @Test
    public void pba() {
        List<Operacion> ops = GeneraOperaciones.loadData(18);
        Procesador p = new Procesador();
        p.loadData(ops);
        p.setValorActual(Moneda.BTC, 9999+Math.random()*9999);
    }

}
