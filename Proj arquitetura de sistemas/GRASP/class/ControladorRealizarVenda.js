const CatalogoProdutos = require('./CatalogoProdutos');
const Venda = require('./Venda');

class ControladorRealizarVenda {
  #venda;
  #catalogo;

  constructor(data) {
    this.#venda = new Venda();
    this.#catalogo = new CatalogoProdutos();
  }

  getVenda() {
    return this.#venda;
  }

  //Composite
  addItem(codigo_barras, quantidade) {
    let produto = this.#catalogo.consultarProdutos(codigo_barras);
    if (produto) this.#venda.criarItemVenda(quantidade, produto);
  }

}

module.exports = new ControladorRealizarVenda(); 