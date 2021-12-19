fun shippingCost(Total: Int, Natio: Boolean): Double {
    if(Natio==false){
        if(Total < 75.0) {
            return Total * 0.1
        } else {
            return 0.0
        }
    } else {
        return if(Total*0.15 >50.0){
            return 50.0
        } else {
            Total *0.15
        }
    }

}
fun main(args: Array<String>) {

    while(1 == 1){
        println("----- Calculando o frete -----")
        print("Informe o valor da carga comprada: ")

        val totalPedido = readLine()!!.toInt()
        println("---Escolha uma opção---")
        print("É uma carga internacional? (true or false) ")

        if(totalPedido == 1){
            break
        }else{
            val Natio = kotlin.io.readLine()!!.toBoolean()
            kotlin.io.println("O valor do frete da sua compra é de R$: ${shippingCost(totalPedido, Natio)}")
        }
    }
}