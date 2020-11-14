var express = require('express');
var app = express(); 
app.use(express.json()); 

//apresentando resultados
app.post('/soma', function(req,res){
  var body = req.body;
  var result = soma(body.a, body.b); 
  return res.json({result});  
});
app.post('/sub', function(req,res){
  var body = req.body;
  var result = sub(body.a, body.b); 
  return res.json({result});  
});
app.post('/mult', function(req,res){
  var body = req.body;
  var result = mult(body.a, body.b); 
  return res.json({result});  
});
app.post('/div', function(req,res){
  var body = req.body;
  var result = div(body.a, body.b); 
  return res.json({result});  
});

//executando as operações matematicas básicas 
function soma(a=3, b=3) {
  return a + b;
}
function sub(a=5, b=1) {
  return a - b;
}
function mult(a=2, b=2) {
  return a * b;
}
function div(a=10, b=2) {
  return a / b;
}
// iniciando o processo do servidor
app.listen(3001);
