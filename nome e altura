data class Pessoa(val nome: String, val altura: Double)

fun cadastrarPessoas(): List<Pessoa> {
    val pessoas = mutableListOf<Pessoa>()
    for (i in 1..15) {
        println("\nCadastro da ${i}ª pessoa:")
        print("Nome: ")
        val nome = readLine()!!
        print("Altura (em metros): ")
        val altura = readLine()!!.toDouble()

        val pessoa = Pessoa(nome, altura)
        pessoas.add(pessoa)
    }
    return pessoas
}

fun apresentarMenoresOuIguais1_5(pessoas: List<Pessoa>) {
    println("\nPessoas com altura menor ou igual a 1.5m:")
    pessoas.filter { it.altura <= 1.5 }.forEach { println("${it.nome} - Altura: ${it.altura}") }
}

fun apresentarMaioresQue1_5(pessoas: List<Pessoa>) {
    println("\nPessoas com altura maior que 1.5m:")
    pessoas.filter { it.altura > 1.5 }.forEach { println("${it.nome} - Altura: ${it.altura}") }
}

fun apresentarEntre1_5e2_0(pessoas: List<Pessoa>) {
    println("\nPessoas com altura maior que 1.5m e menor que 2.0m:")
    pessoas.filter { it.altura > 1.5 && it.altura < 2.0 }.forEach { println("${it.nome} - Altura: ${it.altura}") }
}

fun calcularMediaAltura(pessoas: List<Pessoa>): Double {
    val somaAltura = pessoas.sumOf { it.altura }
    return somaAltura / pessoas.size
}

fun main() {
    var pessoas = emptyList<Pessoa>()
    
    while (true) {
        println("\nMenu de Opções:")
        println("1. Cadastrar pessoas")
        println("2. Apresentar pessoas menores ou iguais a 1.5m")
        println("3. Apresentar pessoas maiores que 1.5m")
        println("4. Apresentar pessoas entre 1.5m e 2.0m")
        println("5. Apresentar média das alturas")
        println("6. Sair")
        
        print("Escolha uma opção: ")
        val opcao = readLine()!!
        
        when (opcao) {
            "1" -> pessoas = cadastrarPessoas()
            "2" -> apresentarMenoresOuIguais1_5(pessoas)
            "3" -> apresentarMaioresQue1_5(pessoas)
            "4" -> apresentarEntre1_5e2_0(pessoas)
            "5" -> {
                val mediaAltura = calcularMediaAltura(pessoas)
                println("\nMédia das alturas: %.2f".format(mediaAltura))
            }
            "6" -> {
                println("Saindo do programa...")
                break
            }
            else -> println("Opção inválida, tente novamente.")
        }
    }
}
