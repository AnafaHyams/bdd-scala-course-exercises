package lab_heroes_game.flow

import lab_heroes_game.characters.character_patterns.Character
import lab_heroes_game.characters.character_types.{Elf, Hobbit, King, Knight}

import scala.util.Random

object CharacterFactory {

  def createCharacter(): Character = {
    val randomNumber: Int = Random.between(1, 4)

    val character: Character = randomNumber match {
      case 1 => new Hobbit
      case 2 => new Elf
      case 3 => new King
      case 4 => new Knight
    }

    character
  }

}
