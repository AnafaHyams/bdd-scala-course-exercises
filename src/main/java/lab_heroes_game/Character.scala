package lab_heroes_game

trait Character {
  var power: Int
  var hp: Int

  def kick(character: Character):Unit
  def isAlive():Boolean = hp > 0
}
