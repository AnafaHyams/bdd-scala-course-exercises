package lab_heroes_game.characters.character_types

import lab_heroes_game.characters.character_patterns

class Elf extends character_patterns.Character {
  override var power: Int = 10
  override var hp: Int = 10

  override def kick(enemy: character_patterns.Character): Unit = {
    if (this.power > enemy.power) {
      println(s"I'm Elf and enemy is weaker than me so I will kill him now")
      enemy.hp = 0
    } else {
      println("I'm Elf and enemy is NOT weaker than me so I decrease his power by 1")
      enemy.power -= 1
    }
  }
}
