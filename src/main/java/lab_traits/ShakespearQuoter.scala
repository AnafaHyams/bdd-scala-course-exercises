package lab_traits

class ShakespearQuoter(var message:String="to be or not to be") extends Quoter {
  override def printMessage(): Unit = println(message)
}
