# Cálculo do N-ésimo Termo da Sequência de Fibonacci em Java

## Descrição

Este programa calcula um termo da sequência de Fibonacci utilizando a linguagem Java, a estrutura de repetição `while` e o gerenciamento de projeto por meio do Apache Maven.

A sequência de Fibonacci começa com `0` e `1`. Cada termo seguinte é obtido pela soma dos dois termos anteriores:

`0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...`

O programa solicita ao usuário a posição desejada e apresenta o termo correspondente.

## Objetivos

- Compreender a definição da sequência de Fibonacci.
- Utilizar variáveis inteiras para armazenar os termos da sequência.
- Aplicar a estrutura de repetição `while`.
- Compreender a atualização de variáveis em um algoritmo iterativo.
- Analisar a complexidade de tempo e memória do algoritmo.
- Conhecer as limitações do tipo `int` em Java.
- Utilizar o Apache Maven para compilar e executar um projeto Java.

## Definição matemática

A sequência de Fibonacci é definida por:

- `F(0) = 0`
- `F(1) = 1`
- `F(n) = F(n - 1) + F(n - 2)`, para `n >= 2`.

| Posição (`n`) | Termo (`F(n)`) |
|---:|---:|
| 0 | 0 |
| 1 | 1 |
| 2 | 1 |
| 3 | 2 |
| 4 | 3 |
| 5 | 5 |
| 6 | 8 |
| 7 | 13 |
| 8 | 21 |
| 9 | 34 |
| 10 | 55 |

## Funcionamento do programa

O programa realiza as seguintes etapas:

1. **Entrada de dados:** utiliza a classe `Scanner` para solicitar ao usuário a posição desejada.
2. **Inicialização:** define as variáveis `anterior = 1` e `atual = 0`.
3. **Repetição:** executa um laço `while` enquanto `i < n`.
4. **Cálculo:** soma os valores de `anterior` e `atual`, armazenando o resultado em `proximo`.
5. **Atualização:** transfere os valores entre as variáveis para calcular o próximo termo.
6. **Saída:** apresenta o resultado armazenado em `atual`.
7. **Encerramento:** fecha o objeto `Scanner`.

O algoritmo utiliza uma quantidade constante de variáveis, sem armazenar toda a sequência na memória.

**Observação:** o código atual não valida entradas negativas nem trata explicitamente entradas inválidas. Além disso, utiliza o tipo `int`, que possui limites de representação numérica.

## Código-fonte

O arquivo `Principal.java` contém a implementação do programa.

O arquivo `pom.xml`, localizado na raiz do projeto, contém as configurações necessárias para o gerenciamento e a compilação do projeto com o Maven.

## Tecnologias utilizadas

- **Java:** linguagem de programação utilizada na implementação.
- **Apache Maven:** ferramenta de gerenciamento, compilação e execução do projeto.
- **Java Scanner:** classe utilizada para ler a entrada fornecida pelo usuário.

## Pré-requisitos

Antes de executar o projeto, instale:

- Java Development Kit (JDK).
- Apache Maven, caso não esteja utilizando uma ferramenta ou ambiente que já o disponibilize.

Verifique as instalações com os comandos:

```bash
java -version
javac -version
mvn -version
```

## Como executar

Os comandos a seguir devem ser executados no terminal, a partir do diretório raiz do projeto, onde está localizado o arquivo `pom.xml`.

### 1. Compilar o projeto

```bash
mvn compile
```

Esse comando compila o código-fonte do projeto e apresenta eventuais erros de compilação.

### 2. Executar o programa

Caso o `pom.xml` esteja configurado com o plugin Maven Exec, execute:

```bash
mvn exec:java -Dexec.mainClass="Principal"
```

Esse comando inicia a classe `Principal` e permite informar a posição desejada no terminal.

**Importante:** o comando pressupõe que a classe `Principal` esteja no pacote padrão. Se a classe estiver em um pacote nomeado, informe seu nome completo no parâmetro `exec.mainClass`. O plugin Maven Exec também deve estar configurado no `pom.xml`.

### 3. Limpar e recompilar o projeto

Para remover os arquivos gerados anteriormente e realizar uma nova compilação, utilize:

```bash
mvn clean compile
```

O comando `clean` remove os arquivos gerados na compilação anterior, enquanto `compile` compila novamente o código-fonte.

## Exemplos de execução

Para `n = 8`:

```text
Qual o termo você deseja:
8
O termo é :13
```

Para `n = 5`:

```text
Qual o termo você deseja:
5
O termo é :5
```

Para `n = 0`:

```text
Qual o termo você deseja:
0
O termo é :0
```

Os exemplos representam o comportamento do código atual para entradas inteiras válidas.

## Conceito fundamental: cálculo iterativo

O trecho principal do algoritmo é:

```java
proximo = anterior + atual;
anterior = atual;
atual = proximo;
i = i + 1;
```

A variável `proximo` recebe a soma dos dois termos anteriores. Em seguida, as variáveis são atualizadas para preparar o cálculo seguinte.

A variável `i` controla o número de repetições do laço `while`, que continua enquanto `i < n`.

Essa abordagem permite calcular os termos progressivamente sem armazenar todos os valores da sequência.

## Limite do tipo `int`

O programa utiliza o tipo `int`, um inteiro de 32 bits com sinal, cujo valor máximo é `2.147.483.647`.

O termo `F(46) = 1.836.311.903` ainda pode ser representado por `int`. Entretanto, `F(47) = 2.971.215.073` ultrapassa esse limite.

Quando ocorre overflow de inteiro, o Java não lança automaticamente uma exceção. O resultado pode se tornar incorreto devido ao estouro numérico.

Para calcular termos maiores, é possível utilizar o tipo `long` ou a classe `java.math.BigInteger`, que permite representar inteiros de tamanho arbitrário, limitado pela memória disponível.

## Complexidade do algoritmo

- **Complexidade de tempo:** `O(n)`, pois o número de repetições cresce proporcionalmente ao valor informado.
- **Complexidade de espaço auxiliar:** `O(1)`, pois o algoritmo utiliza uma quantidade fixa de variáveis.

Essas classificações consideram as operações e as variáveis utilizadas, sem contabilizar o crescimento do custo da representação numérica para inteiros arbitrariamente grandes.

## Conclusão

O programa demonstra como calcular termos da sequência de Fibonacci em Java por meio de um algoritmo iterativo com `while`. A utilização do Apache Maven permite organizar o projeto, compilar o código-fonte e executar a aplicação por comandos padronizados.

A implementação contribui para o aprendizado de estruturas de repetição, variáveis, algoritmos iterativos, complexidade computacional e limites dos tipos numéricos em Java.
