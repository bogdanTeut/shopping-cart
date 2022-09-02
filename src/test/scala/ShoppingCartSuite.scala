import ShoppingCart.checkout
import org.scalatest.funsuite.AnyFunSuite

class ShoppingCartSuite extends AnyFunSuite {

  test("checkout one apple") {
    assert( checkout(List("Apple")) === 0.6 )
  }

  test("checkout two apples") {
    assert( checkout(List("Apple", "Apple")) === 1.2 )
  }

  test("checkout two oranges") {
    assert( checkout(List("Orange", "Orange")) === 0.5 )
  }

  test("checkout empty list") {
    assert( checkout(List()) === 0.0 )
  }

  test("given null list should throw exception") {
    val caught = intercept[IllegalArgumentException] {
      checkout(null )
    }
    assert( caught.getMessage === "No null values accepted!" )
  }

}
