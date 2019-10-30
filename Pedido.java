

/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;
    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente, LineaPedido linea1, LineaPedido linea2)    {
         this.fecha = fecha;
         this.cliente = cliente;
         this.linea1 = linea1;
         this.linea2 = linea2;
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha() {
         return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente() {
         return cliente;
    }
    
    
    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva() {
         double importeAntesIva = linea1.getCantidad() * linea1.getProducto().getPrecio() + linea2.getCantidad() * linea2.getProducto().getPrecio() ;
         return importeAntesIva;
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() {
         double iva = getImporteTotal() - getImporteAntesIva() ;
         return iva;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() {
         double importeTotal = getImporteAntesIva() + getImporteAntesIva() * IVA;
         return importeTotal;
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String lineaPedido = String.format("IMPORTE SIN IVA: %8,2f", "IVA: %8,2f", "IMPORTE TOTAL: %8,2f", getImporteAntesIva(), getIva(), getImporteTotal());
        return lineaPedido;
    }
    
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public String masAntiguoQue(Pedido otro) {
         Pedido otroPedido = otro;
         if(fecha.antesQue(otroPedido.fecha))
         {
             return "El pedido 1 se ha realizado antes que el pedido 2";
         }
         else{
             return "El pedido 2 se ha realizado antes que el pedido 1";
         }
    }
    
     /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() {
        Pedido pedido = new Pedido(this.fecha, this.cliente, this.linea1, this.linea2);
        return pedido;
    }

}
