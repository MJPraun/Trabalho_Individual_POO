Resolução da lista de exercicios práticos de POO - Residência em TIC Software (Serratec/SENAI - 2026)

Mario Jose Praun

Turma - 037

Exercicio 01

Simulador de Caixa Eletrônico: O objetivo é simular as operações básicas de um terminal bancário via console.

Exercicio 2

Conta Bancária: O objetivo foi migrar a lógica procedural de um simulador de caixa eletrónico para o paradigma de **Programação Orientada a Objetos (POO)**.

Exercicio 3

E-Commerce: Relacionamentos e Encapsulamento. Modelar um Pedido que pertence a um Cliente e contém uma Lista de
ItemPedido.

Exercucio 4

Sistema de Veículos: 

Detalhes:

Criar interface Fretavel com metodo alugarVeiculo(pesoCarga, dias)

Criar interface Tributavel com metodo calcularIpva()

Criar classe mãe abstract sealed Veiculo (final placa, final marca, valorLocacaoDiaria,

final anoFabricacao, precoFipe) implementa Fretavel e Tributavel.

Criar classe filha Caminhao (final capacidadeCargaToneladas).

Criar classe filha CarroPasseio.

Regra de Negócio:

- Ao calcular o valor da locação através do método alugarVeiculo(pesoCarga, dias), caso

o peso da carga informado seja maior que a capacidade máxima do caminhão, deverá

ser aplicado um acréscimo de 10% sobre o valor total das diárias como taxa de

sobrecarga.

- Regra do Governo: Veículos com mais de 20 anos de fabricação são isentos de IPVA

(retornam 0.0). Se for mais novo, o CarroPasseio paga 4% do valor de tabela e o

Caminhao paga 1.5%.

- Deverá ser tratada exceções para criação dos objetos(construtores) e exceções nas

chamadas dos metodos, qualquer parametro inválido deve ser lançada uma exeção e

tratada no metodo main

Java (JDK 17+)
Git para versionamento
GitHub para hospedagem do código
About
Resolução da lista de exercicios práticos de POO - Residência em TIC Software (Serratec/SENAI - 2026)

S
