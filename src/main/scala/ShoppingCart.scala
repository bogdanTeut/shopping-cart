object ShoppingCart {

  def checkout(products: List[String]): Double = {
    0.6 * products.length
  }

}
