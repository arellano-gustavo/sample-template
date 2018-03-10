package mx.qbits.trade;

public class Result {
    private int id;
    private Moneda coin;
    private double origValue;
    private double proporcion;

    public Result(int id, Moneda coin, double origValue, double proporcion) {
        this.id = id;
        this.coin = coin;
        this.origValue = origValue;
        this.proporcion = proporcion;
    }

    public String toString() {
        String info = (proporcion>1)?" + ":" - ";
        double prop = (proporcion > 1)?proporcion-1:1-proporcion;
        return "(Op. --> " + format(this.id) + ") Para " + coin + ", su valor original era: " 
                + this.origValue + "\t (change: " + info + prop + " %)";
    }

    private String format(int id) {
        return id<10?"00"+id:(id<100?"0"+id:id+"");
    }

}
