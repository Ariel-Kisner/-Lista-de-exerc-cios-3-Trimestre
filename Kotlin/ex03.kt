fun main() {
    print("Produto: ")
    val produto = readin()
    print("Preço unitário (ex.: 12.50):")
    val preco = readin().toDouble()
    print("Quantidade: ")
    val quantidade = readin().toInt()

    if (preco < 0 || quantidade <- 0) {
       print("Preço ou quantidade inválios.")
       return
    }

    val total = preco * quantidade
    println("Produto: $produto")
    println("Quantidade: $quantidade")
    println("Total: R$ %.2f".format(total))
}
