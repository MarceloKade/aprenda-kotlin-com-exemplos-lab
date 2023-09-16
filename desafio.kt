// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Matrícula de ${usuario.nome} na formação $nome realizada com sucesso.")
    }
}

fun main() {
    // Criando uma ementa de Desenvolvimento Mobile com Kotlin
    val ementa = listOf(
        ConteudoEducacional("Introdução ao Desenvolvimento Mobile com Kotlin", 90),
        ConteudoEducacional("UI/UX Design para Aplicativos Móveis", 120),
        ConteudoEducacional("Kotlin Avançado: Recursos e Melhores Práticas", 180),
        ConteudoEducacional("Integração com APIs em Aplicativos Android", 90),
        ConteudoEducacional("Desenvolvimento de Aplicativos Multiplataforma", 120)
    )
    
    // Criando alguns usuários
    val usuario1 = Usuario("Bryan")
    val usuario2 = Usuario("Arthur")
    val usuario3 = Usuario("Kellyane")
    
    // Criando uma formação e matriculando usuários
    val formacaoMobileKotlin = Formacao("Desenvolvimento Mobile com Kotlin", ementa)
    formacaoMobileKotlin.matricular(usuario1)
    formacaoMobileKotlin.matricular(usuario2)
    formacaoMobileKotlin.matricular(usuario3)
    
    // Imprimindo informações sobre a formação e os inscritos
    println("Formação: ${formacaoMobileKotlin.nome}")
    println("Conteúdos:")
    for (conteudo in formacaoMobileKotlin.conteudos) {
        println("- ${conteudo.nome} (Carga Horária: ${conteudo.duracao} minutos)")
    }
    println("Inscritos na formação: ${formacaoMobileKotlin.inscritos.joinToString(", ") { it.nome }}.")
}