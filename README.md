
# Consumindo dados da API ViaCEP

<p>implementação de uma aplicação para consultar o endereço a partir de um CEP e salvar as informações em um arquivo json.</p>

  
### Projeto🔨
<p> - Foi criado a classe Endereco que representa os dados representando um endereço (cep, logradouro, complemento, 
  unidade, bairro, localidade, uf)</p>
<p> - A classe ConsultaCep é responsável por consultar a API  ViaCEP para buscar um endereço a partir de um cep</p>
<p> - A classe GeradorDeArquivo cria o arquivo json contendo os dados de um objeto </p>
<p> - A classe Principal com o método main, solicita ao usuário que informe o CEP e utilza as classes para consultar a api ViaCEP
e salva os dados do endereço em um arquivo json</p>
