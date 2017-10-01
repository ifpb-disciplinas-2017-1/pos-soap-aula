from suds.client import Client
from suds.cache import NoCache
url="http://localhost:8080/pos-soap-server/CalculadoraService?wsdl"
client = Client(url, cache=NoCache())
#invocando os metodos
print client.service.subtrair(3,2);
print client.service.SomarNumeros(3,2);
print client.service.imprimirNumero(3,2);
#exibindo os servicos
print client
