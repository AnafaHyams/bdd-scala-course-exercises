package lab_heroes_game.character_types

import lab_heroes_game.character_patterns.RandomDataCharacter

import scala.util.Random

class Knight extends RandomDataCharacter {
  override var power: Int = Random.between(2,12)
  override var hp: Int = Random.between(2,12)
}
