package lab_heroes_game.characters.character_types

import lab_heroes_game.characters.character_patterns

class Hobbit extends character_patterns.Character {
  override var power: Int = 0
  override var hp: Int = 3

  private def toCry(): Unit = println("I'm Hobbit and I'm crying because I have no power")

  override def kick(enemy: character_patterns.Character): Unit = toCry()
}
