var soap = require('soap');
var url = 'http://localhost:8080/pos-soap-server/ServicePessoaService?wsdl';
var pessoa = {'arg0':{
  'id': '0',
  'nome':'Nhonho'
}};
soap.WSDL.prototype.ignoredNamespaces = ['http://ws.pos.ifpb.edu.br/'];
soap.createClient(url, function(err, client) {
    client.salvar(pessoa,function(err,result,res){
         console.log('Retorno:',res);
         client.todasAsPessoas(function(err,result,res){
              console.log(result.return);
         })
    })
    // client.todasAsPessoas(function(err,result,res){
    //      console.log(result.return);
    //     //  console.log('Retorno:',result);
    // })
});
