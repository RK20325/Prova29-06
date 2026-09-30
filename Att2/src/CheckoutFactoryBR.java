package org.example;

class CheckoutFactoryBR implements CheckoutFactory {
    private String CPF;

    CheckoutFactoryBR(String CPF) {
        this.CPF = CPF;
    }

    public Pagamento criarPagamento() {
        return new PagamentoPT();
    }

    public Voucher criarVoucher() {
        return new VoucherPT(NIF);
    }
}
