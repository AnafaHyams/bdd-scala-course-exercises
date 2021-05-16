package lab_heroes_game

object Start {
  def main(args: Array[String]): Unit = {

    println("-------------------------------------------------------")
    println("Hobbit creation:")
    var hobbit = new Hobbit
    println(s"power: ${hobbit.power} and hp: ${hobbit.hp}")
    println("Hobbit kick:---")
    println(s"Is hobbit alive: ${hobbit.isAlive()}")

    println("-------------------------------------------------------")
    println("Elf creation:")
    var elf = new Elf
    println(s"power: ${elf.power} and hp: ${elf.hp}")
    println("Elf kick:---")
    println(s"Is elf alive: ${elf.isAlive()}")


    println("****************************")

    println("Hobbit kick Elf:")
    hobbit.kick(elf)
    println("Elf kick Hobbit:")
    elf.kick(hobbit)


    println("-------------------------------------------------------")

    println("King creation:")
    var king = new King
    println(s"power: ${king.power} and hp: ${king.hp}")
    println("King kick:---")
    println(s"Is King alive: ${king.isAlive()}")

    println("****************************")

    println("Elf kick King:")
    elf.kick(king)
    println("King kick Elf:")
    king.kick(elf)

    println("-------------------------------------------------------")
    println("Knight creation:")
    var knight = new Knight
    println(s"power: ${knight.power} and hp: ${knight.hp}")
    println("Knight kick:---")
    println(s"Is knight alive: ${knight.isAlive()}")

    println("****************************")

    println("Knight kick King:")
    knight.kick(king)
    println("King kick Knight:")
    king.kick(knight)

  }
}
