// Contexto que usa a Strategy
public class Loja {
    private Pagamento pagamento;

    // Permite trocar a estratégia em tempo de execução
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarCompra(double valor) {
        if (pagamento == null) {
            System.out.println("Nenhum método de pagamento selecionado.");
        } else {
            pagamento.pagar(valor);
        }
    }
}
