### Sistema de Compras com padrões GRASP e GOF

> Sistema ainda em Desenvolvimento
### GOF
#### Definições de Padrões Utilizados

> Composite (Composto) Compor objetos em uma estrutura de árvore para representar hierarquias todo-parte recursivas. Permitir ao cliente tratar o “todo” e suas “partes” de maneira indistinta.

> Método responsavel por criar os itens de vendas e adicionar em uma Array na classe ``` Venda.js ```

```Javascript

  criarItemVenda(quantidade, produto) {
    let item = new ItemVenda(quantidade, produto);
    this.#itensVenda.push(item);
  }

```
> Método responsavel por mandar itens para ``` criarItemVenda ``` na classe ``` ControladorRealizarVenda.js ```

```Javascript

  addItem(codigo_barras, quantidade) {
    let produto = this.#catalogo.consultarProdutos(codigo_barras);
    if (produto) this.#venda.criarItemVenda(quantidade, produto);
  }

```
### GRASP

> Classe Creator ``` Venda.js ``` e Classe Controller ``` ControladorRealizarVenda.js ```

#### Definições de Padrões Utilizados
>Creator (Criador) — Determina qual classe deve ser responsável pela criação certos objetos.

>Controller (Controlador) — Atribui a responsabilidade de lidar com os eventos do sistema para uma classe que representa a um cenário de caso de uso do sistema global.
