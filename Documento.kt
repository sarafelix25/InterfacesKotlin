class Documento(override var nome: String, override var tipoDeDocumento: String)
    : Imprimivel {
    override fun imprimir() {
        println("Eu sou um documento word")
        print("Tipo de Dcoumento: $tipoDeDocumento\nNome: $nome\n")
    }
}