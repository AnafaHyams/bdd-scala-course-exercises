package classwork_implicit_with_class

object Registry {

  implicit def getNewExtension(str: String): Extensions = {
    new Extensions(str)
  }

}
