# 🧠 Kotlin Lógico: Exercícios de Cadastro e Processamento de Dados

> Uma coletânea de exercícios feitos em **Kotlin**, voltados para o treino de **lógica de programação**, estruturas condicionais, repetição e uso de listas.  
> Cada projeto traz um pequeno sistema de cadastro com funcionalidades específicas — simples, direto ao ponto e com sabor de evolução.

## 🧩 Projetos inclusos

### 1. 👣 Cadastro de Pessoas por Altura
Sistema que cadastra 15 pessoas e permite:
- Listar quem tem altura **menor ou igual a 1.5m**
- Listar quem tem altura **maior que 1.5m**
- Filtrar alturas entre **1.5m e 2.0m**
- Calcular a **média de altura** das pessoas cadastradas

### 2. 📚 Cadastro e Consulta de Alunos
Sistema que cadastra 20 alunos, calcula a média de 4 notas e classifica como **"Aprovado"** ou **"Reprovado"**.
- Permite **pesquisar um aluno pelo nome**
- Mostra todos os alunos ordenados pelo nome
- Exibe nome, média e status final

### 3. 🏢 Cadastro de Funcionários
Sistema para cadastro de 20 funcionários com matrícula, nome e salário.
- Permite pesquisar por **matrícula**
- Mostra quem ganha **acima**, **abaixo** ou **exatamente R$ 1.000,00**

## 🔧 Tecnologias usadas

- Linguagem: [Kotlin](https://kotlinlang.org/) (última versão)
- Plataforma: Terminal/Console
- Entrada de dados via `readLine()` (interativo)

## 🏁 Como rodar

1. Tenha o [Kotlin instalado](https://kotlinlang.org/docs/command-line.html) ou use um compilador online como [Replit](https://replit.com/) ou [JDoodle](https://www.jdoodle.com/kotlin-online).
2. Copie e cole o código desejado em um arquivo `.kt` (ex: `Main.kt`)
3. Compile e execute no terminal:

```bash
kotlinc Main.kt -include-runtime -d main.jar
java -jar main.jar
