import scala.annotation.tailrec

object Q02_ProductOfAllOtherIntegers  extends App {

  getProductsOfAllIntsExceptAtIndex(Array(1, 2, 3, 4, 5))

  def getProductsOfAllIntsExceptAtIndex(intArr: Array[Int]) = {

    require(intArr.length > 2, "Multiplication on every other indices is not" +
      " possible with the current list size")

    var productSoFar = 1

    // Perform first traversal to calculate all products of indices before index i
    val allIndices = for(
      (num, idx) <- intArr.zipWithIndex
    ) yield (num, idx)
    println(allIndices.mkString(" "))

    // Iterate backwards from last indices to multiply current_products_so_far with all iterations after the index


    // return result

  }

}
