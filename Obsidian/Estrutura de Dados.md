#Estrutura-de-Dados ^8110e9

Estrutura de dados é uma estrutura organizada de dados na memória de um computador ou em qualquer dispositivo de armazenamento, de forma que os dados possam ser utilizados de forma correta.

Essas estruturas encontram muitas aplicações no desenvolvimento de sistemas, sendo que algumas são altamente especializadas e utilizadas em tarefas específicas.
Usando as estruturas adequadas através de algoritmos, podeemos trabalhar com uma grande quantidade de dados, como aplicações em bancos de dados ou serviços de busca.


#Lista

Estrutura de Dados do tipo Lista, armazena dados de um determinado tipo em uma ordem específica.

A diferença entre listas e arrays é a de que as listas possuem tamanho ajustável, eenquanto arrays possuem tamanho fixo.

Existem dois tipos de listas:

#Ligadas

Na estrutura do tipo lista existem os nós onde cada um dos nós conhece o valor que está sendo armazenado em seu interior aléem de conhecer o elemento posterior a ele: por isso ela é chamada de "lista ligada", pois os nós são amarrados com essa indicação de qual é o proximo nó.
![[Pasted image 20220114121623.png]]
![[Pasted image 20220114124726.png]]

#DuplamenteLigadas

As listas fuplamente ligadas constituem uma variação das listas ligadas.

A grande diferença das listas duplamente ligadas para as listas ligadas é que elas são bidirecionais. Vimos que, naturalmente, não conseguimos "andar para trás" em listas ligadas, pois os nós de uma lista ligada sabem somente que é o próximo elemento. Nas listas duplamente ligadas, os nós sabem que é o próximo elemento e também qum é o elemento anteerior, o que permit a navegação reversa.

![[Pasted image 20220114130247.png]]


#Pilhas

Uma Pilha é uma estrutura de dados que serve como uma coleção de elementos, e permite o acesso a somente um item de dados armazenado.

O acesso aos itens de uma pilha é restrito - somente um item pode ser lido ou removido por vez.

#Tipo-de-Pilhas:

#LIFO ou #UEPS
#FIFO ou #PEPS 

A estrutura do tipo PILHA LIFO (Last in First Out), apresenta o seguinte critério: o Primeiro elemento a ser retirado é o ultimo que tiver sido inserido.
![[Pasted image 20220114165151.png]]

A estrutura do tipo PILHA FIFO (First in First Out), apresenta o seguinte critério: o Primeiro elemento a ser retirado é o primeiro que tiver sido inserido.
![[Pasted image 20220114165208.png]] ^52dfe5

#Filas 

A estrutura do tipo Fila admite remoção de elementos e inserção de novos sujeita à seguinte regra de operação: 

o elemento removido é o que eestá na estrutura há mais tempo ou seja, o primeiro objeto inserido na fila é também o primeiro a ser removido seguindo o conceito [[#^52dfe5|FIFO]].
	![[Pasted image 20220114170007.png]]


#Árvores

É uma estrutura de dados que organiza seus elementos de forma hierárquica, onde existe um elemento que fica no topo da árvore, chammado de raiz e existem os elementos subordinados a ele, que são chamados de nós ou folhas.

![[Pasted image 20220118122546.png]]

#Tabela-Hash

Uma tabela hash, de dispersão ou espalhamento é uma estrutura de dados especial, que associa chaves de pesquisa a valores.

Uma tabela hash é uma generalização da idéia de array, porém utiliza uma função denominada hashing para espalhar os elementos, fazendo com que os mesmos fiquem de forma não ordenada dentro do "array" que define a tabela.

Por que espalhar?

A tabela hash permmite a associação de "valores" a "chaves"

Valores: é a posição ou índice onde o elemento se encontra

Chave: parte da informação que compões o elemento a ser manipulado

Espalhar facilita a busca na estrutura de dados, pois a partir de uma chave podemos acessar de forma rápida uma posição do "array"

