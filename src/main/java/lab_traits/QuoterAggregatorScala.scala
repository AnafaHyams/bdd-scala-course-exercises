package lab_traits

object QuoterAggregatorScala {

  var quotes: List[Quoter] = Nil

  def addQuoter(quote: Quoter): Unit = {
    quotes = quote::quotes
  }

  def printAllMessages(): Unit = {
    quotes.foreach(quote => quote.printMessage())
  }
}
