package classwork_implicit_with_class

class Extensions (str: String) {

  def isBlank(): Boolean = {
    var stringNotExists: Boolean = false

    if(str.isEmpty) {
      stringNotExists = true
    }

    stringNotExists
  }

  def isEmail(): Boolean = {
    var stringIsEmail: Boolean = false

    if(str.contains(".") && str.contains("@")) {
      stringIsEmail = true
    }

    stringIsEmail
  }

}
