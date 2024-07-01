object Act3 {
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  def main(args: Array[String]): Unit = {
    println("Reversed String: " + reverseString("HELLO"))
  }
}
