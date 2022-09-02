import ShoppingCart.checkout
import org.scalatest.funsuite.AnyFunSuite

class ShoppingCartSuite extends AnyFunSuite {

  test("checkout one apple") {
    assert( checkout(List("Apple")) === 0.6 )
  }

}
