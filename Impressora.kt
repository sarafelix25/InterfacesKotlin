class Impressora(var listaImprimivel: MutableList<Imprimivel> = mutableListOf()) {




    fun adicionar(imprimivel: Imprimivel){
        listaImprimivel.add(imprimivel)
    }

    fun imprimirLista() {
        for(Imprimivel in listaImprimivel){
          println("${Imprimivel.imprimir()}\n")
       }
    }



}