package org.example;

class Checkout {
    private CheckoutFactory factory;

    Checkout(CheckoutFactory factory) {
        this.factory = factory;
    }

    String confirmarReserva(double valor) {
        ComprovanteFiscal cf = factory.criarComprovanteFiscal();
        Pagamento pagamento = factory.criarPagamento();
        Voucher voucher = factory.criarEtiqueta();

        return "=== Relatório do Pedido ===\n"
                + cf.emitir() + "\n"
                + pagamento.processar(valor) + "\n"
                + voucher.gerar();
    }
}
