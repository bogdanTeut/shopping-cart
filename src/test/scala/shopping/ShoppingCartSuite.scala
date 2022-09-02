package shopping

import org.scalatest.funsuite.AnyFunSuite

class ShoppingCartSuite extends AnyFunSuite {

  private val productTypes = List(
    new ProductType("Apple", 0.60),
    new ProductType("Orange", 0.25)
  )

  val shoppingCart = new ShoppingCart(productTypes)

  test("checkout one apple") {
    assert( shoppingCart.checkout(List("Apple")) === 0.6 )
  }

  test("checkout two apples") {
    assert( shoppingCart.checkout(List("Apple", "Apple")) === 1.2 )
  }

  test("checkout two oranges") {
    assert( shoppingCart.checkout(List("Orange", "Orange")) === 0.5 )
  }

  test("checkout empty list") {
    assert( shoppingCart.checkout(List()) === 0.0 )
  }

  test("given null list should throw exception") {
    val caught = intercept[IllegalArgumentException] {
      shoppingCart.checkout(null )
    }
    assert( caught.getMessage === "No null values accepted!" )
  }

  test("checkout two apples and two oranges") {
    assert( shoppingCart.checkout(List("Apple", "Orange", "Apple", "Orange")) === 1.7)
  }

}
