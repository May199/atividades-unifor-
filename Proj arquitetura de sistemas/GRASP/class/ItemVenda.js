class ItemVenda {
    #quantidade;
    #produto;
  
    constructor(quantidade, produto) {
      this.#quantidade = quantidade;
      this.#produto = produto;
    }
  
    toString() {
      return this.#produto.toString() + ` ${this.#quantidade}`
    }
  
    getQuantidade() {
      return this.#quantidade;
    }
    getProduto() {
      return this.#produto;
    }
  
    calcularSubTotal() {
      return this.#quantidade * this.#produto.getPreco();
    }
  }
  
  module.exports = ItemVenda;
  