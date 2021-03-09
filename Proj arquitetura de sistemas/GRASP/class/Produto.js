module.exports = class Produto{
    #descricao;
    #preco; 
    #codigo_barra;
  
    constructor(descricao, preco, codigo_barra){
        this.#descricao = descricao;
        this.#preco = preco;
        this.#codigo_barra = codigo_barra;
    }
  
    toString() {
      return `${this.#codigo_barra} ${this.#preco} ${this.#descricao}`
    }
  
    getDescricao(){return this.#descricao;}
    setDescricao(descricao) { this.#descricao = descricao; }
  
    getPreco(){return this.#preco;}
    setPreco(preco) { this.#preco = preco;}
  
    getCodigo_barra(){return this.#codigo_barra;}
    setCodigo_barra(codigo_barra) { this.#codigo_barra = codigo_barra;}
  
  }