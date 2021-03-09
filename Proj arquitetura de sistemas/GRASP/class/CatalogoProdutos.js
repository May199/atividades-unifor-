const Produto = require("./Produto");

module.exports = class CatalogoProdutos {
  #produtos;

  constructor() {
    this.#produtos = [
      new Produto('livro UML Fowler', 75.5, '001'),
      new Produto('livro Redes', 80.0, '002'),
      new Produto('livro SO', 70.0, '003'),
    ];
  }
  consultarProdutos(codigo_barra) {
    return this.#produtos.reduce((tmp, produto) => {
      if(produto.getCodigo_barra() === codigo_barra) {
        return produto
      } else {
        return tmp
      }
    }, undefined);
  }
}
