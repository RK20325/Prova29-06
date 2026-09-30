package org.example;

interface CheckoutFactory {
    ComprovanteFiscal criarComprovanteFiscal();

    Pagamento criarPagamento();

    Voucher criarVoucher();
}
