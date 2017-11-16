object Q01_AppleStocks extends App {

  def getMaxProfit(stockPricesYesterday: Array[Int]): Int = {

    var maxProfit = 0
    for (
      innerTime <- stockPricesYesterday.indices;
      outterTime <- stockPricesYesterday.indices) {

      // for each pair find the earlier and later times
      val earlierTime = Math.min(outterTime, innerTime)
      val laterTime = Math.max(outterTime, innerTime)
      //
      // and use those to find the earlier and later prices
      val earlierPrice = stockPricesYesterday(earlierTime)
      val laterPrice = stockPricesYesterday(laterTime)

      val potentialProfit = laterPrice - earlierPrice
      maxProfit = Math.max(maxProfit, potentialProfit)
    }
    maxProfit
  }

  def maxProfitFunc(stockPricesYesterday: List[Int]) = {
    stockPricesYesterday.reduceLeft( _ min _ )
  }
}
