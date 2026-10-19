# Cálculo do N-ésimo Termo da Sequência de Fibonacci em Java

## Descrição

Este programa calcula o n-ésimo termo da sequência de Fibonacci utilizando Java.

A sequência começa com `0` e `1`. Cada termo seguinte é a soma dos dois anteriores:

`0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...`

O programa solicita ao usuário a posição `n` e apresenta o termo correspondente. A contagem começa em zero: `F(0) = 0` e `F(1) = 1`.

## Objetivos

-   Compreender a definição da sequência de Fibonacci.
-   Utilizar estruturas condicionais para tratar as posições iniciais e entradas inválidas.
-   Aplicar uma estrutura de repetição para calcular termos da sequência.
-   Utilizar variáveis para armazenar os dois termos anteriores.
-   Analisar a complexidade de tempo e memória de um algoritmo iterativo.
-   Compreender os limites de representação do tipo `long` em Java.

## Definição matemática

A sequência é definida por:

-   `F(0) = 0`
-   `F(1) = 1`
-   `F(n) = F(n - 1) + F(n - 2)`, para `n >= 2`

    Posição (`n`)   Termo (`F(n)`)
  --------------- ----------------
                0                0
                1                1
                2                1
                3                2
                4                3
                5                5
                6                8
                7               13
                8               21
                9               34
               10               55

## Funcionamento do programa

O programa realiza as seguintes etapas:

1.  **Entrada de dados:** solicita a posição `n` que deseja calcular.
2.  **Validação:** se `n` for negativo, exibe uma mensagem de erro.
3.  **Tratamento dos casos iniciais:** se `n` for `0` ou `1`, apresenta diretamente o termo correspondente.
4.  **Cálculo iterativo:** para posições maiores que `1`, soma os dois termos anteriores e atualiza as variáveis até alcançar a posição solicitada.
5.  **Saída:** exibe o resultado no formato `F(n) = valor`.

O algoritmo utiliza as variáveis `anterior`, `atual` e `proximo`. Assim, calcula os termos sem armazenar a sequência inteira.

## Código-fonte

O arquivo `Principal.java` contém a implementação do programa.

## Como executar

É necessário ter o Java Development Kit (JDK) e o Apache Maven instalados. O projeto deve conter o arquivo `pom.xml` na raiz do diretório.

**1. Compile o projeto**

``` bash
mvn compile
```

Ou utilize a IDE.

**2. Execute o programa**

``` bash
mvn exec:java -Dexec.mainClass="Principal"
```

Ou utilize a IDE.

Esse comando pressupõe que a classe `Principal` esteja no pacote padrão e que o plugin Maven Exec esteja configurado no `pom.xml`.

## Exemplos de execução

Para `n = 8`:

``` text
Informe a posição n da sequência de Fibonacci: 8 
F(8) = 21
```

Para `n = 0`:

``` text
Informe a posição n da sequência de Fibonacci: 0
F(0) = 0
```

Para uma entrada negativa:

``` text
Informe a posição n da sequência de Fibonacci: -3
Erro: informe um número inteiro não negativo.
```

## Conceito fundamental: cálculo iterativo

O cálculo iterativo utiliza um laço `for` para gerar os termos em ordem crescente. Em cada repetição, o próximo termo é calculado pela soma dos dois valores disponíveis:

``` java
proximo = anterior + atual;
anterior = atual;
atual = proximo;
```

A atualização mantém apenas as informações necessárias para calcular o próximo termo, sem armazenar a sequência inteira.

## Limite do tipo `long`

O programa utiliza `long`, um tipo inteiro de 64 bits com sinal. O maior termo da sequência de Fibonacci que cabe nesse tipo é `F(92) = 7540113804746346429`.

A partir de `F(93)`, o resultado ultrapassa o valor máximo de `long` e ocorre overflow de inteiro. O Java não lança automaticamente uma exceção nesse caso; o resultado torna-se incorreto devido ao estouro numérico.

Para calcular termos maiores com exatidão, pode-se utilizar `java.math.BigInteger`, que permite representar inteiros de tamanho arbitrário, limitado pela memória disponível.

## Conclusão

O programa demonstra como calcular a sequência de Fibonacci com estruturas condicionais e repetição em Java. A solução iterativa tem complexidade de tempo `O(n)` e utiliza memória auxiliar constante, sendo adequada para estudar algoritmos, variáveis, laços e análise de complexidade.
