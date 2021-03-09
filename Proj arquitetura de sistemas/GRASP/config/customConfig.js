const express = require('express');
const expressLayout = require('express-ejs-layouts');
const consign = require('consign');

module.exports = () => {
    const app = express();

    app.set('views', __dirname + '/views/');
    app.set('view engine', 'ejs');
    app.use(expressLayout);
    app.use(express.static(__dirname + '/public/')); //quando colocar essa pasta como static, usa apenas o caminho apartir daqui
    app.use(express.urlencoded({extended:true}));
    app.use(express.json());

    //organiza as rotas na pasta controllers
    consign()
        .include('controllers')
        .into(app)

    return app
}