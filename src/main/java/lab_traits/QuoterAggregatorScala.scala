package lab_traits

object QuoterAggregatorScala {

  var quotes: List[Quoter] = Nil

  def addQuoter(quote: Quoter): Unit = {
    quotes = quote::quotes
    println(s"quote:  $quote")
  }

  def printAllMessages(): Unit = {
    quotes.foreach(quote => quote.printMessage())
  }
}
