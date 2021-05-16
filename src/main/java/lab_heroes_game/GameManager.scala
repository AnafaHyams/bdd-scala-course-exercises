package lab_heroes_game

object GameManager {

  def fight(c1: Character, c2: Character): Unit = {
    var roundNumber: Int = 0

    while (c1.isAlive() && c2.isAlive()) {
      println("*********************************************")
      roundNumber += 1
      println(s"Round $roundNumber:")

      println(s"${c1.getClass.getSimpleName} kick ${c2.getClass.getSimpleName}")
      c1.kick(c2)
      println(s"${c2.getClass.getSimpleName} kick ${c1.getClass.getSimpleName}")
      c2.kick(c1)
    }

    gameOver(c1,c2)
  }

  private def gameOver(c1: Character, c2: Character): Unit = {
    println("*********************************************")
    println("GAME OVER!!")

    val message = (c1.isAlive(),c2.isAlive()) match {
      case (true,false) => s"${c1.getClass.getSimpleName} win at that fight"
      case (false,true) => s"${c2.getClass.getSimpleName} win at that fight"
      case (false,false) => s"No one win the game - ${c1.getClass.getSimpleName} and ${c2.getClass.getSimpleName} are dead :("
    }

    println(message)

  }

}
