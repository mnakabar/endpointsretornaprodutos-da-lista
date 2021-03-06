package com.company;

public class Main {

    public static void main(String[] args) {


        //---------------------Criando 1O Pessoa -----------------------------------
        Pessoa igor = new Pessoa("Igor", "Santana de Parnaiba", "11-98765-4321", 35, 1.9);
        Pessoa jenifer = new Pessoa("Jenifer", "Barueri", "11-98765-6578", 30, 1.5);
        Pessoa bernardo = new Pessoa("Bernardo", "Osasco", "11-99876-3210", 15, 1.7);
        Pessoa melissa = new Pessoa("Melissa", "Jandira", "11-99879-5678", 8, 1.5);
        Pessoa mauricio = new Pessoa("Mauricio", "Santana de Parnaíba", "11-98425-3228", 49, 1.85);
        Pessoa danilo = new Pessoa("Danilo", "Jandira", "11-98765-5643", 30, 1.65);
        Pessoa patricia = new Pessoa("Patrícia", "São Paulo", "11-97690-1098", 40, 1.65);
        Pessoa camila = new Pessoa("Camila", "São Paulo", "11-99875-5555", 13, 1.68);
        Pessoa cicera = new Pessoa("Cicera", "Osasco", "11-945342-6541", 60, 1.73);
        Pessoa luara = new Pessoa("Luara", "São Paulo", "11-91212-0695", 5, 1.7);

        //---------------------Objeto Agenda-----------------------------------------------
        Agenda receberPessoa = new Agenda();
        receberPessoa.armazenarPessoas(igor);
        receberPessoa.armazenarPessoas(jenifer);
        receberPessoa.armazenarPessoas(bernardo);
        receberPessoa.armazenarPessoas(melissa);
        receberPessoa.armazenarPessoas(mauricio);
        receberPessoa.armazenarPessoas(danilo);
        receberPessoa.armazenarPessoas(patricia);
        receberPessoa.armazenarPessoas(camila);
        receberPessoa.armazenarPessoas(cicera);
        receberPessoa.armazenarPessoas(luara);


        System.out.println("\n==========Remover pessoa da lista=============================");
        receberPessoa.removePessoa("Cicera");
        System.out.println(cicera);

        System.out.println("\n==========Buscar  pessoa da lista pelo nome===================");
        receberPessoa.buscarPessoa("Jenifer");
        System.out.println(jenifer);

        System.out.println("\n==========Exibir toda agenda===================================");
        receberPessoa.exibirTodaAgenda();

        System.out.println("\n==========Exibir uma pessoa em espefico da agenda==============");
        System.out.println(igor);

        System.out.println("\n=======Ordenar lista de pessoas em ordem alfabética de nome====");
        receberPessoa.listarPessoasEmOrdemAlfabéticaDeNome();

        System.out.println("\n=======Ordenar lista de pessoas em ordem alfabética de endereco====");
        receberPessoa.listarPessoasEmOrdemAlfabéticaDeEndereco();

        System.out.println("\n=======Ordenar lista de pessoas em ordem descrescente de idade=====");
        receberPessoa.listarPessoasEmOrdemAlfabéticaDeIdade();

    }
}
