class Foto(override var nome: String, override var tipoDeDocumento: String)
    : Imprimivel {

    override fun imprimir() {
        println("Eu sou uma selfie")
        print("Tipo de Dcoumento: $tipoDeDocumento\nNome: $nome\n")
    }
}