package lab_heroes_game

import scala.util.Random

abstract class RandomDataCharacter extends Character {

  override def kick(enemy: Character): Unit = {
    var randomDecreaseNum: Int = Random.between(0,this.power + 1)
    println(s"I decrease enemy hp by $randomDecreaseNum")
    enemy.hp -= randomDecreaseNum
  }

}

