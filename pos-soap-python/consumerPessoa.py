from suds.client import Client
from suds.cache import NoCache
url="http://localhost:8080/pos-soap-server/ServicePessoaService?wsdl"
client = Client(url, cache=NoCache())
pessoa = {
    'id': '0',
    'nome':'Florinda'
}
#invocando os metodos
client.service.salvar(pessoa);
print client.service.todasAsPessoas();
#print client
