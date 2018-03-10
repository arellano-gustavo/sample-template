package mx.qbits.trade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GeneraOperaciones {
    // Vamos a crear 'n' operaciones financieras a Random:
    public static List<Operacion> loadData(int n) {
        List<Operacion> operaciones = new ArrayList<>();
        for(int i=0;i<n;i++) {
            UUID id = UUID.randomUUID();
            double first = 123.45+Math.random()*999;
            double second = 9999+Math.random()*9999;
            Operacion op = new Operacion(id.toString(), true, 12345L, Moneda.XRP, Moneda.BTC, first, second);
            operaciones.add(op);
        }
        System.out.println(n + " Operaciones financieras creadas !!!");
        return operaciones;
    }

}
