package lab_traits

object Start {

  def main(args: Array[String]): Unit = {
    println("Object implementation:")
    RandomQuoter.printMessage()

    println("-------------------------------------------------------")
    println("Class implementation:")
    println("\tDefault message:")
    val defaultMessageQuoter = new ShakespearQuoter()
    defaultMessageQuoter.printMessage()
    println("\tNot default message:")
    val notDefaultMessageQuoter = new ShakespearQuoter("Hello there")
    notDefaultMessageQuoter.printMessage()

    println("-------------------------------------------------------")
    println("Case class implementation:")
    val messageQuoter = new MessageQuoter("abc")
    messageQuoter.printMessage()
  }

}
