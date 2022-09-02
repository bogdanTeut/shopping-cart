object ShoppingCart {

  def checkout(products: List[String]): Double = {
    def calculateApplesPrice = {
      products.count(_ == "Apple") * 0.6
    }

    def calculateOrangePrice = {
      products.count(_ == "Orange") * 0.25
    }

    calculateApplesPrice + calculateOrangePrice
  }

}
