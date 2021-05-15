package lab_case_classes_and_objects

object LoginValidator {

  def validate(login:NewLogin):Unit = {
    if(login.username == "admin") {
      println(s"Name can't be admin and now username = ${login.username}")
    } else if (login.password.startsWith("z")) {
      println(s"Password can't start from 'z' and now password = ${login.password}")
    } else if (login.password == login.username) {
      println(s"Password can't be equal to username and now username and passwords = ${login.password}")
    } else if (login.password.forall(ele => {ele.isDigit})) {
      println(s"Password can't contains only digits")
    } else if (login.password != login.confirmPassword) {
      println(s"ConfirmPassword should equal password and now password = ${login.password} and confirm password = ${login.confirmPassword}")
    } else {
      println("accepted")
    }
  }

}



