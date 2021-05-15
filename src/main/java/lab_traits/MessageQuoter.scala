package lab_traits

case class MessageQuoter(val message:String) extends Quoter() {
  override def printMessage(): Unit = println(message)
}
