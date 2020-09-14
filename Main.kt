fun main() {
    val contrato = Contrato("Doc1","Contrato")
    val documento = Documento("Doc2","Documento")
    val foto = Foto("Doc3","Foto")



    val impressora = Impressora()
    impressora.adicionar(contrato)
    impressora.adicionar(documento)
    impressora.adicionar(foto)

    impressora.imprimirLista()
}