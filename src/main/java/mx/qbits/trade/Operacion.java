package mx.qbits.trade;

/**
 * Abstracción de una operación de compra (o de venta) de un
 * instrumento financiero.
 */
public class Operacion {
    private String uid;
    private boolean compra = true;// venta = not compra
    private long timestamp;
    private Moneda fuente;// p. ej xrp
    private Moneda destino;// p. ej. btc
    private double cantidad;// 0.5 btc (i.e. gastaré 923 xrp's)
    private double costoDestino; // 1846 xrp por btc
    private boolean procesada=false;
    
    public Operacion(
            String uid, 
            boolean compra, 
            long timestamp, 
            Moneda fuente, 
            Moneda destino, 
            double cantidad,
            double costoDestino) {
        this.uid = uid;
        this.compra = compra;
        this.timestamp = timestamp;
        this.fuente = fuente;
        this.destino = destino;
        this.cantidad = cantidad;
        this.costoDestino = costoDestino;
    }

    public String getUid() {
        return uid;
    }

    public boolean isCompra() {
        return compra;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Moneda getFuente() {
        return fuente;
    }

    public Moneda getDestino() {
        return destino;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getCostoDestino() {
        return costoDestino;
    }

    public boolean isProcesada() {
        return this.procesada;
    }

    public void setProcesada(boolean procesada) {
        this.procesada = procesada;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
        result = prime * result + ((uid == null) ? 0 : uid.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Operacion other = (Operacion) obj;
        if (timestamp != other.timestamp)
            return false;
        if (uid == null) {
            if (other.uid != null)
                return false;
        } else if (!uid.equals(other.uid))
            return false;
        return true;
    }

}
