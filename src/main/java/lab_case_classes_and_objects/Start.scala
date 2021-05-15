package lab_case_classes_and_objects

object Start {

  def main(args: Array[String]): Unit = {
    val newLogin = NewLogin("Anafa", "ABC123", "ABC123")
    println(newLogin)

    LoginValidator.validate(newLogin)
  }

}