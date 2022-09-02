import ShoppingCart.checkout
import org.scalatest.funsuite.AnyFunSuite

class ShoppingCartSuite extends AnyFunSuite {

  test("checkout one apple") {
    assert( checkout(List("Apple")) === 0.6 )
  }

  test("checkout two apples") {
    assert( checkout(List("Apple", "Apple")) === 1.2)
  }

}
