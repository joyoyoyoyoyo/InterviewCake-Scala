import org.scalatest.FlatSpec

class ProductOfAllOtherNumbersTest extends FlatSpec {

  val tests = Map(
    Array(1, 7, 3, 4) -> Array(84, 12, 28, 21)
  )

  "Given [1, 7, 3, 4], the function" should "return [84, 12, 28, 21]." in {


  }

  "[1, 7, 3, 4]" should "perform the following multiplication operations " +
    "[7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]." in {
    ???
  }

}
