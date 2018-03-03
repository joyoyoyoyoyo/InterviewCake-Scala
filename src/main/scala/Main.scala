// e.g.[1, 3, 5] price: e.g 11  output: min num of conis needed,  11 coins 1, 3
// input: array of int, price, int; output: int
// @author: Angel Ortega
object Main {
  def main(args: Array[String]) = {

    def coinChange(coins: List[Int], price: Int): Int = coinChangeHelper(coins.reverse, price, 0)

    @scala.annotation.tailrec
    def coinChangeHelper(coins: List[Int], price: Int, output: Int): Int = {
      coins match {
        // Found the price, return output

        case coin :: Nil if (coin + output) == price => {
          println(s"Price=${price}, coins=${coins.mkString("[", "," ,"]")}, output=${output}")
          output
        }

        // coin is too big, try again on next lower coin.
        case coin :: otherCoins if (coin + output) > price => {
          println(s"Price=${price}, coins=${coins.mkString("[", "," ,"]")}, output=${output}")
          //undo deduction
          coinChangeHelper(otherCoins, price + coin, output - 1)
        }

        // more change needed,
        case coin :: otherCoins => {
          println(s"Price=${price}, coins=${coins.mkString("[", "," ,"]")}, output=${output}")
          coinChangeHelper(coin :: otherCoins, price - coin, output + 1)
        }
        // No more coins, return output
        case Nil => {
          output - 1
        }
      }
    }

    // Space complexity, operates in O(1), since an accumulator is used to scan through the list
    // Time complexity, operates in O(n), where n is the length of the list
    val change = coinChange(List(1, 3, 5), 11)
    println(change)
  }

}