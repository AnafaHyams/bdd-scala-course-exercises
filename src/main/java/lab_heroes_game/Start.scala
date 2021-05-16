package lab_heroes_game

object Start {
  def main(args: Array[String]): Unit = {

    println("-------------------------------------------------------")
    println("Hobbit creation:")
    val hobbit = new Hobbit
    println(s"power: ${hobbit.power} and hp: ${hobbit.hp}")
    println("Hobbit kick:")
    println(s"Is hobbit alive: ${hobbit.isAlive()}")

  }
}
