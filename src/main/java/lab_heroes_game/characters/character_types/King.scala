package lab_heroes_game.characters.character_types

import lab_heroes_game.characters.character_patterns.RandomDataCharacter

import scala.util.Random

class King extends RandomDataCharacter {
  override var power: Int = Random.between(5,16)
  override var hp: Int = Random.between(5,16)
}
