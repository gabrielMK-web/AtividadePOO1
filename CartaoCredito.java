public class CartaoCredito extends Pagamento {
    
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito.");
    }
}