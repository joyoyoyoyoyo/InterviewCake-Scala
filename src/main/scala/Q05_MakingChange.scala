/**
  * # __Your quirky boss collects rare, old coins...__
  *
  * They found out you're a programmer and asked you to
  * solve something they've been wondering for a long time.
  *
  * Write a function that, given:
  *
  *   1. an `amount` of money
  *   2. a list of coin `denominations`
  *
  * computes the number of ways to make the amount of money
  * with coins of the available `denominations`.
  *
  * __Example__: for `amount` = 4 (4 cents) and
  * denominations = [1, 2, 3] (1 cent, 2 cent, 3 cent),
  * your program would output 4 -- the number of ways to make
  * 4 cents with those `denominations`:
  *
  *   1. 1 cent, 1 cent, 1 cent, 1 cent
  *   2. 1 cent, 1 cent, 2 cent
  *   3. 1 cent, 3 cent
  *   4. 2 cent, 2 cent
  *
  */
object Q05_MakingChange extends App {

  // Each denomination is a coin or cent
  val coins = Array(1, 2, 3)
  val amount = 4

  val number_of_iterations = Solution.makeChange(denominations=coins, amount)


  val message = s"Number of Ways to Make Amount $amount, with coins"
  println(message)

}

object Solution {

  def makeChange(denominations: Array[Int], amountSought: Int) = {
    require(denominations.size > 0 && amountSought > 0)

    def loop(denominations: Seq[Int], amountLeft: Int): Int = {
      denominations match {
        case coin +: Seq() => { println(s"$coin"); coin }
        case head +: tail => { println(s"$head"); loop(tail, amountLeft - head) }
      }
    }

    loop(denominations, amountSought)
  }
}
