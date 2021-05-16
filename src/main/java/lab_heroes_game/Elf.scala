package lab_heroes_game

class Elf extends Character {
  override var power: Int = 10
  override var hp: Int = 10

  override def kick(enemy: Character): Unit = {
    if (this.power > enemy.power) {
      println(s"Enemy is weaker than me (Elf) so I will kill him now")
      enemy.hp = 0
    } else {
      println()
      enemy.power -= 1
    }

    println(s"Enemy power = ${enemy.power} ; Enemy hp = ${enemy.hp}")
  }
}
