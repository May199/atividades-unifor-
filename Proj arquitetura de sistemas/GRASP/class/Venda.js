const ItemVenda = require("./ItemVenda");

class Venda {
  #itensVenda;
  #dataVenda;

  constructor(dataVenda) {
    this.#itensVenda = [];
    this.#dataVenda = dataVenda;
  }

  getTotal() {
    let total = 0;

    while (this.#itensVenda.length) {
      total += itensVenda.calcularSubTotal();
    }
    return total;
  }

  criarItemVenda(quantidade, produto) {
    let item = new ItemVenda(quantidade, produto);
    this.#itensVenda.push(item);
  }

  getItensVenda() {
    return this.#itensVenda;
  }

  getDataVenda() {
    return this.#dataVenda;
  }

  
  // getTroco() {
  //   return pagamento.getValorPago() - getTotal();
  // }

  // efetuarPagamento() {
  //   pagamento = new Pagamento(valorRecebido);
  // }
}
module.exports = Venda;
