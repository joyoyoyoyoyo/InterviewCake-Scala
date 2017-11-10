import scala.annotation.tailrec

object Q02ProdAllExceptIndex {



  def getProductsOfAllIntsExceptAtIndex(intArr: Array[Int]) = {

    require(intArr.length < 2, "Multiplication on every other indices is not" +
      " possible with the current list size")

    @tailrec
    def everyOther(
         productions: Array[Int],
         otherElem: Int,
         binOp: (Int, Int) => Int): Int = {
      otherElem match {
        case 0 => 1
        case _ => everyOther(productions, otherElem -1, _ * _)
      }
    }

    val product = everyOther(intArr,
      intArr.length - 1,
      _* _)

  }

}
