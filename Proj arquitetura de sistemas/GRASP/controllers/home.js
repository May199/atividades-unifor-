module.exports = app => {
    const controlador = require('../class/ControladorRealizarVenda');

    app.get('/', (req, res) => {
        res.render('pages/home', {
            itensVenda:controlador.getVenda().getItensVenda()
        });
    });

    app.post('/', (req, res) => {
        const {produto} = req.body;
        const {quantidade} = req.body;

        const entrada1 = produto;
        const entrada2 = quantidade; 

        controlador.addItem(entrada1, entrada2);

        return res.redirect('http://localhost:3000');
        
    });
} 

