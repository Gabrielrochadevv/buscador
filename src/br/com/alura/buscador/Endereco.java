package br.com.alura.buscador;

public record Endereco(String cep, String logradouro, String complemento,
                       String unidade, String bairro, String localidade, String uf) {
}
