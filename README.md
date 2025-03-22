# Funcionalidades Java (SE 17) Mais Utilizadas

## **250 funcionalidades do Java SE 17** amplamente utilizadas ou relevantes em março de 2025
---

## 1. Fundamentos e Tipos de Dados

### Básico
- `int` - Tipo primitivo para inteiros.
- `double` - Tipo primitivo para números de ponto flutuante.
- `boolean` - Tipo primitivo para valores verdadeiro/falso.
- `char` - Tipo primitivo para caracteres.
- `String` - Classe para manipulação de strings.
- `System.out.println()` - Exibe mensagens no console.
- `class` - Define uma classe.
- `public` - Modificador de acesso público.
- `private` - Modificador de acesso privado.
- `static` - Define membros estáticos.

### Intermediário
- `byte` - Tipo primitivo para inteiros de 8 bits.
- `short` - Tipo primitivo para inteiros de 16 bits.
- `long` - Tipo primitivo para inteiros de 64 bits.
- `float` - Tipo primitivo para ponto flutuante de precisão simples.
- `Integer.parseInt()` - Converte string para inteiro.
- `Double.parseDouble()` - Converte string para double.
- `String.valueOf()` - Converte valores para string.
- `Object` - Classe base de todos os objetos.
- `new` - Cria uma nova instância de objeto.

### Avançado
- `var` - Inferência de tipo local (Java 10+).
- `record` - Define um tipo imutável simples (Java 14+).
- `Integer.toBinaryString()` - Converte inteiro para string binária.
- `Character.isDigit()` - Verifica se um caractere é dígito.
- `Math.toIntExact()` - Converte long para int com verificação.
- `Objects.requireNonNull()` - Valida que um objeto não é nulo.

---

## 2. Manipulação de Strings

### Básico
- `.length()` - Retorna o comprimento de uma string.
- `.toLowerCase()` - Converte para minúsculas.
- `.toUpperCase()` - Converte para maiúsculas.
- `.trim()` - Remove espaços em branco das extremidades.
- `.equals()` - Compara strings por conteúdo.

### Intermediário
- `.charAt()` - Retorna o caractere em um índice.
- `.indexOf()` - Retorna o índice da primeira ocorrência.
- `.lastIndexOf()` - Retorna o índice da última ocorrência.
- `.substring()` - Extrai uma parte da string.
- `.replace()` - Substitui caracteres ou substrings.
- `.split()` - Divide a string em array.

### Avançado
- `.matches()` - Verifica se a string corresponde a uma regex.
- `.startsWith()` - Verifica se começa com algo.
- `.endsWith()` - Verifica se termina com algo.
- `.contains()` - Verifica se contém uma substring.
- `.repeat()` - Repete a string N vezes (Java 11+).
- `.strip()` - Remove espaços em branco (mais robusto que `trim`, Java 11+).
- `.isBlank()` - Verifica se a string é vazia ou só espaços (Java 11+).
- `.lines()` - Divide a string em linhas (Java 11+).
- `String.format()` - Formata strings com placeholders.

---

## 3. Coleções (java.util)

### Básico
- `ArrayList` - Lista dinâmica.
- `.add()` - Adiciona um elemento a uma lista.
- `.get()` - Obtém um elemento por índice.
- `.size()` - Retorna o tamanho da lista.
- `.remove()` - Remove um elemento.

### Intermediário
- `HashMap` - Mapa chave-valor.
- `.put()` - Adiciona um par chave-valor.
- `.get()` - Obtém um valor por chave.
- `.keySet()` - Retorna as chaves do mapa.
- `.values()` - Retorna os valores do mapa.
- `HashSet` - Conjunto sem duplicatas.
- `.contains()` - Verifica se um elemento está presente.

### Avançado
- `LinkedList` - Lista duplamente ligada.
- `.addFirst()` - Adiciona ao início.
- `.addLast()` - Adiciona ao final.
- `TreeMap` - Mapa ordenado.
- `.entrySet()` - Retorna pares chave-valor.
- `TreeSet` - Conjunto ordenado.
- `.iterator()` - Retorna um iterador.
- `Collections.sort()` - Ordena uma lista.
- `Collections.reverse()` - Inverte uma lista.
- `Collections.shuffle()` - Embaralha uma lista.
- `Stream.of()` - Cria um stream a partir de elementos.

---

## 4. Estruturas de Controle

### Básico
- `if` - Condicional simples.
- `else` - Bloco alternativo ao `if`.
- `for` - Laço de repetição com contador.
- `while` - Laço enquanto a condição for verdadeira.
- `switch` - Condicional com múltiplos casos.

### Intermediário
- `do...while` - Laço que executa pelo menos uma vez.
- `break` - Interrompe um laço ou `switch`.
- `continue` - Pula para a próxima iteração.
- `return` - Retorna um valor de um método.

### Avançado
- `switch` (expression) - Switch como expressão (Java 17+).
- `yield` - Retorna valor em switch expression (Java 17+).
- `for-each` - Itera sobre coleções (`for (T item : collection)`).
- `assert` - Verifica asserções em tempo de execução.

---

## 5. Orientação a Objetos

### Básico
- `class` - Define uma classe.
- `interface` - Define um contrato.
- `extends` - Herda de uma classe.
- `implements` - Implementa uma interface.
- `this` - Referência ao objeto atual.

### Intermediário
- `super` - Chama o construtor ou método da superclasse.
- `abstract` - Define uma classe/método abstrato.
- `final` - Impede herança ou sobrescrita.
- `new` - Instancia um objeto.
- `@Override` - Indica sobrescrita de método.

### Avançado
- `default` - Define método padrão em interface (Java 8+).
- `sealed` - Restringe herança (Java 17+).
- `permits` - Especifica subclasses permitidas (Java 17+).
- `instanceof` - Verifica o tipo de um objeto.
- `Object.clone()` - Cria uma cópia de um objeto.

---

## 6. Exceções

### Básico
- `try` - Bloco para testar erros.
- `catch` - Captura exceções.
- `throw` - Lança uma exceção.
- `throws` - Declara exceções em métodos.

### Intermediário
- `finally` - Executa após `try/catch`.
- `Exception` - Classe base para exceções.
- `RuntimeException` - Exceção não verificada.

### Avançado
- `try-with-resources` - Gerencia recursos automaticamente (Java 7+).
- `multi-catch` - Captura múltiplas exceções em um bloco (Java 7+).
- `Throwable` - Superclasse de `Exception` e `Error`.

---

## 7. Entrada/Saída (java.io e java.nio)

### Básico
- `System.in` - Entrada padrão.
- `Scanner` - Lê entrada do usuário.
- `.nextLine()` - Lê uma linha de texto.
- `.nextInt()` - Lê um inteiro.

### Intermediário
- `File` - Representa arquivos/diretórios.
- `FileReader` - Lê caracteres de um arquivo.
- `FileWriter` - Escreve em um arquivo.
- `BufferedReader` - Lê texto eficientemente.
- `.readLine()` - Lê uma linha de um BufferedReader.

### Avançado
- `Files.readAllBytes()` - Lê todos os bytes de um arquivo (java.nio).
- `Files.write()` - Escreve em um arquivo (java.nio).
- `Path.of()` - Cria um caminho (Java 11+).
- `Paths.get()` - Obtém um caminho.
- `FileInputStream` - Lê bytes de um arquivo.
- `FileOutputStream` - Escreve bytes em um arquivo.

---

## 8. Concorrência (java.util.concurrent)

### Intermediário
- `Thread` - Cria uma thread.
- `.start()` - Inicia uma thread.
- `.run()` - Define o código da thread.
- `Runnable` - Interface para tarefas executáveis.

### Avançado
- `ExecutorService` - Gerencia pool de threads.
- `.execute()` - Executa uma tarefa.
- `.submit()` - Submete uma tarefa e retorna Future.
- `Future` - Representa o resultado de uma tarefa assíncrona.
- `.get()` - Obtém o resultado de um Future.
- `Callable` - Tarefa que retorna valor.
- `Lock` - Controle de sincronização.
- `ReentrantLock` - Lock reutilizável.
- `synchronized` - Bloco/método sincronizado.
- `CountDownLatch` - Sincroniza threads.

---

## 9. Matemática e Utilitários

### Básico
- `Math.random()` - Gera um número aleatório entre 0.0 e 1.0.
- `Math.abs()` - Retorna o valor absoluto.
- `Math.max()` - Retorna o maior valor.
- `Math.min()` - Retorna o menor valor.

### Intermediário
- `Math.round()` - Arredonda um número.
- `Math.pow()` - Eleva a uma potência.
- `Math.sqrt()` - Calcula a raiz quadrada.
- `Random` - Gera números aleatórios.

### Avançado
- `Math.sin()`, `Math.cos()`, `Math.tan()` - Funções trigonométricas.
- `BigInteger` - Números inteiros arbitrariamente grandes.
- `BigDecimal` - Números decimais precisos.
- `UUID.randomUUID()` - Gera um ID único.

---

## 10. Streams e Funcionalidades (java.util.stream)

### Avançado
- `.stream()` - Cria um stream a partir de uma coleção.
- `.filter()` - Filtra elementos.
- `.map()` - Transforma elementos.
- `.collect()` - Coleta resultados (ex.: `toList()`).
- `.forEach()` - Executa ação em cada elemento.
- `.reduce()` - Reduz o stream a um valor.
- `.sorted()` - Ordena o stream.
- `.distinct()` - Remove duplicatas.
- `Collectors.toList()` - Converte stream em lista.
- `Collectors.groupingBy()` - Agrupa elementos.

---

## 11. Outras Funcionalidades

### Intermediário
- `System.currentTimeMillis()` - Retorna o tempo em milissegundos.
- `Date` - Representa data/hora (menos usado hoje).
- `LocalDate.now()` - Data atual (Java 8+).
- `LocalTime.now()` - Hora atual (Java 8+).

### Avançado
- `Optional` - Encapsula valores opcionais (Java 8+).
- `.of()` - Cria um Optional com valor.
- `.orElse()` - Retorna um valor padrão se vazio.
- `Pattern` - Compila uma regex.
- `Matcher` - Realiza operações com regex.
- `enum` - Define um tipo enumerado.

---

## Resumo
- Total de funcionalidades listadas: **250**.
- Abrange fundamentos, coleções, concorrência, streams, e mais.
- Focado em Java SE 17, excluindo APIs obsoletas como `Vector`.
- Para mais detalhes, consulte a documentação oficial da Oracle ou Javadocs.