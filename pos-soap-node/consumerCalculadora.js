var soap = require('soap');
var url = 'http://localhost:8080/pos-soap-server/CalculadoraService?wsdl';
var primeiro = {'primeiro':2, 'segundo':4};
var segundo = {'arg0':9, 'arg1':4};
soap.WSDL.prototype.ignoredNamespaces = [];
soap.createClient(url, function(err, client) {
    client.SomarNumeros(primeiro,function(err,result,res){
         console.log('Método somar:',result.return);
         console.log('Retorno:',result);
    })
    client.subtrair(segundo,function(err,result,res){
         console.log('Método subtrair:',result.valorDeRetorno);
         console.log('Retorno:',result);
         console.log('Resposta:',res);
    })
});
