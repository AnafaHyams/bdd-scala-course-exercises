package lab_traits

import scala.util.Random

object RandomQuoter extends Quoter {

  private val quotes: List[String] = List("The future belongs to those who believe in the beauty of their dreams",
  "The way to get started is to quit talking and begin doing",
  "Your time is limited, so don't waste it living someone else's life",
  "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough",
  "Life is what happens when you're busy making other plans")

  override def printMessage(): Unit = {
    val randomIndex = Random.between(0,quotes.length)
    println(quotes(randomIndex))
  }
}
