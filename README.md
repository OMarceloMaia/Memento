# Padrões de Projeto – Memento
 
## Motivação .:

*Memento é um padrão de projeto comportamental que, sem violar o encapsulamento, tem como premissa a captura e externalização de um estado interno de um objeto, de modo a garantir que o mesmo possa ser posteriormente restaurado.*

---
Conhecido como o "Ctrl + Z", é implementado em praticamente todas as aplicações. 

Garante encapsulamento e consistência em backups e desacopla da classe principal a responsabilidade de tomar conta de seus backups. 

Ao compreender isso, percebemos que além da original é necessário ao menos duas outras classes para tornar a premissa verdadeira chamadas de: Caretaker e Memento - e a Originator (classe principal).
Caretaker: responsabilidade de gerir os backups a medida que mudanças são feitas no objeto, já que é desacoplada tal função da classe principal com o intuito de ser mais simples a restauração de dados;
Memento:  garantir o encapsulamento e segurança de dados, servindo como ponte com o último estado (de forma opaca) a possivelmente ser restaurado.
Os dados pertencentes a classe originadora poderão ser utilizadas apenas pela mesma, ao solicitar ao Memento, pois as demais não podem ter acesso as informações privadas contidas nele, apenas realizarão a manipulação da classe.

Resumindo como pontos positivos: 
- Desacopla a responsabilidade de tomar conta do backup, ou seja, seu histórico, da classe original;
- É fácil de salvar e restaurar um backup de uma classe.

Como pontos negativos:
- Quanto mais backups mais consumo de memória;
- As classes zeladoras precisam acompanhar as mudanças das originadoras;
- Pode ser desafiador garantir o encapsulamento em algumas linguagens de programação.
 
---

## Implementação e Estrutura

 Todo o código foi separado em três classes Java + uma Main para Testes, são elas:
 
- A classe Original com os atributos privados como: stade e date; e métodos de: getter, setter, saveToMemento, getFromMemento;

- A classe Memento com os atributos encapsulados da classe principal e o método de getState;

- E por fim, a classe de Caretaker desenvolvida com pilha, a fim de garantir o conceito de FILO (First-in, Last-out), ou seja, que o empilhamento das classes de estado (Memento) sejam recuparadas do último estado salvo ao primeiro.

*Todo o processo foi feito em call com todos os integrantes do grupo.*

