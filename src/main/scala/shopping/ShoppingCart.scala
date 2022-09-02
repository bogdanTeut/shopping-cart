package shopping

class ShoppingCart(productTypes: List[ProductType]) {

  def checkout(products: List[String]): Double = {
    def calculatePrice(productType: ProductType): Double = {
      products.count(_ == productType.name) * productType.price
    }

    products match {
      case null => throw new IllegalArgumentException("No null values accepted!")
      case _ => productTypes.map(calculatePrice).sum
    }
  }
}

class ProductType(val name: String, val price: Double)
