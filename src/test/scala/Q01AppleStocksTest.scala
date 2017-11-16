import org.scalatest.FlatSpec

class Q01_AppleStocksTest extends FlatSpec {

  "Stock prices" should "get $6" in {
    val stockPricesYesterday = Array(10, 7, 5, 8, 11, 9)
    assert(Q01_AppleStocks.getMaxProfit(stockPricesYesterday) == 6)
  }

  ""


}