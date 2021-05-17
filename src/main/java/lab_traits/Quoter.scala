package lab_traits

trait Quoter {

  registerInQuoterAggregator()

  def printMessage():Unit

  final def registerInQuoterAggregator(): Unit = QuoterAggregator.addQuoter(this)

}
