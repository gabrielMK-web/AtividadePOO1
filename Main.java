public class Main {
    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new CartaoDebito();
        Pagamento p3 = new Boleto();
        Pagamento p4 = new Pix();


        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
        p4.processarPagamento();


        p1.processarPagamento(200.0);
        p2.processarPagamento(150.0, "20/09/2025");

    }
}