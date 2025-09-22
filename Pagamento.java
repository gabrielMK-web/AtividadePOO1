public abstract class Pagamento {

    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$:" + valor);
    }

    public void processarPagamento(double valor, String data) {
        System.out.println("Processando pagamento de R$:" + valor + " na data:" + data);
    }

    public abstract void
processarPagamento();
}
