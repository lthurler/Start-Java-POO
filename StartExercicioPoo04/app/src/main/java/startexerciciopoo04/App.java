
package startexerciciopoo04;

public class App {
    
    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "processador", 0 , 1200.0f);

        System.out.println("Valor do Pedido: " + inv.getInvoiceAmount());

    }
}
