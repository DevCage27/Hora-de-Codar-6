data class Funcionario(val matricula: Int, val nome: String, val salario: Double)

fun cadastrarFuncionarios(): List<Funcionario> {
    val funcionarios = mutableListOf<Funcionario>()
    for (i in 1..20) {
        println("\nCadastro do $iº funcionário:")
        print("Matrícula: ")
        val matricula = readLine()!!.toInt()
        print("Nome: ")
        val nome = readLine()!!
        print("Salário: ")
        val salario = readLine()!!.toDouble()

        val funcionario = Funcionario(matricula, nome, salario)
        funcionarios.add(funcionario)
    }
    
    // Ordenar os funcionários pela matrícula
    return funcionarios.sortedBy { it.matricula }
}

fun pesquisarFuncionario(matricula: Int, funcionarios: List<Funcionario>) {
    val funcionario = funcionarios.find { it.matricula == matricula }
    if (funcionario != null) {
        println("\nFuncionário encontrado: ${funcionario.nome} - Matrícula: ${funcionario.matricula} - Salário: ${funcionario.salario}")
    } else {
        println("\nFuncionário não encontrado!")
    }
}

fun apresentarAcimaDe1000(funcionarios: List<Funcionario>) {
    println("\nFuncionários com salário acima de R$1.000,00:")
    funcionarios.filter { it.salario > 1000.0 }.forEach { 
        println("${it.matricula} - ${it.nome} - Salário: R$${it.salario}")
    }
}

fun apresentarAbaixoDe1000(funcionarios: List<Funcionario>) {
    println("\nFuncionários com salário abaixo de R$1.000,00:")
    funcionarios.filter { it.salario < 1000.0 }.forEach { 
        println("${it.matricula} - ${it.nome} - Salário: R$${it.salario}")
    }
}

fun apresentarIgual1000(funcionarios: List<Funcionario>) {
    println("\nFuncionários com salário igual a R$1.000,00:")
    funcionarios.filter { it.salario == 1000.0 }.forEach { 
        println("${it.matricula} - ${it.nome} - Salário: R$${it.salario}")
    }
}

fun main() {
    var funcionarios = emptyList<Funcionario>()
    
    while (true) {
        println("\nMenu de Opções:")
        println("1. Cadastrar funcionários")
        println("2. Pesquisar funcionário por matrícula")
        println("3. Apresentar funcionários com salário acima de R$1.000,00")
        println("4. Apresentar funcionários com salário abaixo de R$1.000,00")
        println("5. Apresentar funcionários com salário igual a R$1.000,00")
        println("6. Sair")
        
        print("Escolha uma opção: ")
        val opcao = readLine()!!
        
        when (opcao) {
            "1" -> funcionarios = cadastrarFuncionarios()
            "2" -> {
                print("Digite o número da matrícula para pesquisa: ")
                val matricula = readLine()!!.toInt()
                pesquisarFuncionario(matricula, funcionarios)
            }
            "3" -> apresentarAcimaDe1000(funcionarios)
            "4" -> apresentarAbaixoDe1000(funcionarios)
            "5" -> apresentarIgual1000(funcionarios)
            "6" -> {
                println("Saindo do programa...")
                break
            }
            else -> println("Opção inválida, tente novamente.")
        }
    }
}
