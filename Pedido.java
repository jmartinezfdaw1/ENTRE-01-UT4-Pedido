

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
         importeAntesIva = linea1.getCantidad() * linea1.getProducto();
         return importeAntesIva;
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() {
         iva = getImporteTotal() - getImporteAntesIva() ;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() {
         importeTotal = getImporteAntesIva() + getImporteAntesIva() * IVA;
         return importeTotal;
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String lineaPedido = String.format("%-20s \n%-20s \n%-20s", "IMPORTE SIN IVA: %8,2f", "IVA: %8,2f", "IMPORTE TOTAL: %8,2f", getImporteAntesIva(), getIva(), getImporteTotal());
        return fecha.toString() + cliente.toString() + linea1.toString() + linea2.toString() + lineaPedido;
    }
    
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) {
         Pedido otroPedido = otro;
         if(fecha.antesQue(otroPedido))
         {
             return true;
         }
    }
    
     /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() {
        return otroPedido;
    }

}
