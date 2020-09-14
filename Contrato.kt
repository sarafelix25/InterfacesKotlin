class Contrato(override var nome: String, override var tipoDeDocumento: String) : Imprimivel {
    override fun imprimir() {
        println("Eu sou um contrato muito legal")
        print("Tipo de Dcoumento: $tipoDeDocumento\nNome: $nome\n")
    }



}