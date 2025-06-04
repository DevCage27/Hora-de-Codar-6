data class Aluno(val nome: String, val nota1: Double, val nota2: Double, val nota3: Double, val nota4: Double) {
    val media: Double = (nota1 + nota2 + nota3 + nota4) / 4
    val status: String = if (media >= 5) "Aprovado" else "Reprovado"

    override fun toString(): String {
        return "$nome - Média: %.2f - Status: $status".format(media)
    }
}

fun cadastrarAlunos(): List<Aluno> {
    val alunos = mutableListOf<Aluno>()
    for (i in 1..20) {
        println("\nCadastro do $iº aluno:")
        print("Nome: ")
        val nome = readLine()!!
        print("Nota 1: ")
        val nota1 = readLine()!!.toDouble()
        print("Nota 2: ")
        val nota2 = readLine()!!.toDouble()
        print("Nota 3: ")
        val nota3 = readLine()!!.toDouble()
        print("Nota 4: ")
        val nota4 = readLine()!!.toDouble()

        val aluno = Aluno(nome, nota1, nota2, nota3, nota4)
        alunos.add(aluno)
    }

    // Ordenar alunos por nome
    return alunos.sortedBy { it.nome }
}

fun pesquisarAluno(alunos: List<Aluno>) {
    print("\nDigite o nome do aluno para pesquisa: ")
    val nomePesquisa = readLine()!!

    val aluno = alunos.find { it.nome.equals(nomePesquisa, ignoreCase = true) }
    if (aluno != null) {
        println(aluno)
    } else {
        println("Aluno não encontrado!")
    }
}

fun mostrarTodosAlunos(alunos: List<Aluno>) {
    println("\nTodos os alunos cadastrados:")
    alunos.forEach { println(it) }
}

fun main() {
    var alunos = emptyList<Aluno>()

    while (true) {
        println("\nMenu de Opções:")
        println("1. Cadastrar alunos")
        println("2. Pesquisar aluno")
        println("3. Mostrar todos os alunos")
        println("4. Sair")

        print("Escolha uma opção: ")
        val opcao = readLine()!!

        when (opcao) {
            "1" -> alunos = cadastrarAlunos()
            "2" -> pesquisarAluno(alunos)
            "3" -> mostrarTodosAlunos(alunos)
            "4" -> {
                println("Saindo do programa...")
                break
            }
            else -> println("Opção inválida, tente novamente.")
        }
    }
}
