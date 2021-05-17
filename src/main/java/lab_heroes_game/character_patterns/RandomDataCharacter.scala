package lab_heroes_game.character_patterns

import lab_heroes_game.character_patterns

import scala.util.Random

abstract class RandomDataCharacter extends character_patterns.Character {

  override def kick(enemy: character_patterns.Character): Unit = {
    var randomDecreaseNum: Int = Random.between(0,this.power + 1)
    println(s"I decrease enemy hp by $randomDecreaseNum")
    enemy.hp -= randomDecreaseNum
  }

}

