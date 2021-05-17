package lab_heroes_game

import lab_heroes_game.flow.{CharacterFactory, GameManager}

object Start {
  def main(args: Array[String]): Unit = {

    var character1: character_patterns.Character = CharacterFactory.createCharacter()
    var character2: character_patterns.Character = CharacterFactory.createCharacter()

    printRandomCharactersDetails(character1,character2)

    GameManager.fight(character1, character2)

  }

  private def printRandomCharactersDetails(c1: character_patterns.Character, c2: character_patterns.Character): Unit = {
    println("Characters in Hero Game:")
    println(s"Character 1: ${c1.getClass.getSimpleName} with power = ${c1.power} and hp = ${c1.hp}")
    println(s"Character 2: ${c2.getClass.getSimpleName} with power = ${c2.power} and hp = ${c2.hp}")
  }
}
