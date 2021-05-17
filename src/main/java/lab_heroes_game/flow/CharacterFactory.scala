package lab_heroes_game.flow

import lab_heroes_game.character_patterns
import lab_heroes_game.characters.{Elf, Hobbit, King, Knight}

import scala.util.Random

object CharacterFactory {

  def createCharacter(): character_patterns.Character = {
    val randomNumber: Int = Random.between(1, 4)

    val character: character_patterns.Character = randomNumber match {
      case 1 => new Hobbit
      case 2 => new Elf
      case 3 => new King
      case 4 => new Knight
    }

    character
  }

}
