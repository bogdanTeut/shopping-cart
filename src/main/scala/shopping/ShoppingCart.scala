package shopping

class ShoppingCart(productTypes: List[ProductType], offers: List[Offer]) {

  def checkout(products: List[String]): BigDecimal = {
    def numberOfProductsAfterApplyingOffer(name: String, numberOfProducts: Int): Int = {
      offers
        .find(_.name == name)
        .map(offer => numberOfProducts / offer.from * offer.to + numberOfProducts % offer.from)
        .getOrElse(numberOfProducts)
    }

    def calculatePrice(productType: ProductType): BigDecimal = {
      val numberOfProducts = numberOfProductsAfterApplyingOffer(productType.name, products.count(_ == productType.name))
      productType.price.*(numberOfProducts)
    }

    products match {
      case null => throw new IllegalArgumentException("No null values accepted!")
      case _ => productTypes.map(calculatePrice).sum
    }
  }
}

class ProductType(val name: String, val price: BigDecimal)
class Offer(val name: String, val from: Int, val to: Int)
