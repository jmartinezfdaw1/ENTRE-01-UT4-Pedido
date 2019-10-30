
/**
 *  Clase para probar el resto de clases
 *  
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    public TestPedido()    {
        // crear pedido1
       pedido1 = new Pedido(new Fecha(4, 9, 2019), 
                            new Cliente("Juan Soto", "Avda. Pio XII", "Pamplona", "Navarra"), 
                            new LineaPedido(new Producto("Rotulador fosforescente", 6.70), 20), 
                            new LineaPedido(new Producto("Memoria USB 64GB", 14.80), 10));
        // crear pedido2
       pedido2 = new Pedido(new Fecha(8, 10, 2019),
                 new Cliente("Elisa Nuin", "C/ Rio Alzania 7", "Pamplona", "Navarra"), 
                 new LineaPedido(new Producto("Sacapuntas manual", 16.64), 8), 
                 new LineaPedido(new Producto("Corrector tippex", 5.99), 20)); 

    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.printf("Pedido 1" +
                           "\n----------------------------" +
                           "\nFECHA PEDIDO: " + pedido1.getFecha() +
                           "\nDATOS DEL CLIENTE" +
                           "\n" + pedido1.getCliente() +
                           "\n" +
                           "\n**** Articulos en el pedido ****" +
                           "\n" +
                           "\n        Rotulador fosforescente |     6,70€ unidad |     20 unidades " +
                           "\n               Memoria USB 64GB |    14,80€ unidad |     10 unidades " +
                           "\n" +
                           "\n**** A pagar ****" +
                           "\n" +
                           "\n     IMPORTE SIN IVA:   " + pedido1.getImporteAntesIva() + "€" +
                           "\n                 IVA:    " + pedido1.getIva() + "€" +
                           "\n       IMPORTE TOTAL:   " + pedido1.getImporteTotal() + "€" +
                           "\n" +
                           "\n" +
                           "\n" +
                           "Pedido 2" +
                           "\n----------------------------" +
                           "\nFECHA PEDIDO: " + pedido2.getFecha() +
                           "\nDATOS DEL CLIENTE" +
                           "\n" + pedido2.getCliente() +
                           "\n" +
                           "\n**** Articulos en el pedido ****" +
                           "\n" +
                           "\n              Sacapuntas manual |   16,64€ unidad |      8 unidades " +
                           "\n               Corrector tippex |    5,99€ unidad |     20 unidades " +
                           "\n" +
                           "\n**** A pagar ****" +
                           "\n" +
                           "\n     IMPORTE SIN IVA:   " + pedido2.getImporteAntesIva() + "€" +
                           "\n                 IVA:    " + pedido2.getIva() + "€" +
                           "\n       IMPORTE TOTAL:   " + pedido2.getImporteTotal() + "€" +
                           "\n" +
                           "\n" + pedido1.masAntiguoQue(pedido2));

    }
}
