class Pagamento {
    valorPago; 

    constructor(valorPago){
        this.valorPago = valorPago;
    }
    getValorPago(){
        return this.valorPago;
    }
}
module.exports = Pagamento;