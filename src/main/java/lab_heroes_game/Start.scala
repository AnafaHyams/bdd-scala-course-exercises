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

    println("-------------------------------------------------------")
    println("-------------------------------------------------------")

    println("Hobbit kick Elf:")
    hobbit.kick(elf)
    println("Elf kick Hobbit:")
    elf.kick(hobbit)


    println("-------------------------------------------------------")
    println("-------------------------------------------------------")


  }
}
