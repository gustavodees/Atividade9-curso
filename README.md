# Verifica se um Valor Inteiro é Não Negativo ou Negativo em Java

Este programa Java solicita ao usuário que digite um valor inteiro e, em seguida, exibe uma mensagem informando se o valor inserido é não negativo (maior ou igual a zero) ou negativo (menor que zero).

## Como Executar

1.  **Salve o código:** Salve o código Java fornecido como `Main.java` dentro de um diretório chamado `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório que contém a pasta `principal` e compile o código utilizando o compilador Java:
    ```bash
    javac principal/Main.java
    ```
    Este comando irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.
3.  **Execute o programa:** Ainda no terminal ou prompt de comando, execute o programa utilizando a Máquina Virtual Java:
    ```bash
    java principal.Main
    ```
    Uma caixa de diálogo pop-up aparecerá solicitando que você digite um valor inteiro e pressione "OK". Após a entrada, outra caixa de diálogo exibirá o resultado.

## Explicação do Código

O programa realiza as seguintes ações:

1.  **Importa a classe JOptionPane:** A linha `import javax.swing.*;` permite que o programa utilize a classe `JOptionPane` para interagir com o usuário através de caixas de diálogo.
2.  **Lê a entrada do usuário:**
    * `int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));` exibe uma caixa de diálogo solicitando que o usuário digite um valor inteiro.
    * O valor digitado, que é inicialmente uma String, é convertido para um inteiro usando `Integer.parseInt()` e armazenado na variável `a`.
3.  **Verifica se o valor é não negativo ou negativo:**
    * `if (a >= 0 ){ ... } else { ... }` é uma estrutura condicional que verifica o valor da variável `a`.
    * Se `a` for maior ou igual a 0 (não negativo), o código dentro do bloco `if` é executado.
    * Caso contrário (se `a` for menor que 0, ou seja, negativo), o código dentro do bloco `else` é executado.
4.  **Exibe a mensagem de resultado:**
    * `JOptionPane.showMessageDialog(null, "O valor é não negativo");` exibe uma caixa de diálogo com a mensagem "O valor é não negativo" se a condição do `if` for verdadeira.
    * `JOptionPane.showMessageDialog(null, "O valor é negativo");` exibe uma caixa de diálogo com a mensagem "O valor é negativo" se a condição do `if` for falsa (ou seja, o bloco `else` é executado).

Este programa ilustra um exemplo simples de como obter entrada do usuário e usar uma estrutura condicional (`if-else`) para tomar decisões e exibir resultados diferentes com base nessa entrada, utilizando as funcionalidades da biblioteca Swing em Java.
