object ShoppingCart {

  def checkout(products: List[String]): Double = {
    val isApple: String => Boolean = _ == "Apple"
    val isOrange: String => Boolean = _ == "Orange"

    def calculatePrice(productPrice: Double, p: String => Boolean): Double = {
      products.count(p) * productPrice
    }

    calculatePrice(0.6, isApple) + calculatePrice(0.25, isOrange)
  }

}
