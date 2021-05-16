package lab_heroes_game

class Hobbit extends Character {
  override var power: Int = 0
  override var hp: Int = 3

  private def toCry(): Unit = println("I'm Hobbit and I'm crying because I have no power")

  override def kick(character: Character): Unit = {
    toCry()
  }
}