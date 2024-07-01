object Act3 {
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  def filterLongStrings(strings: List[String]): List[String] = {
  strings match {
    case Nil => Nil
    case head :: tail =>
      if (head.length > 5) {
        head :: filterLongStrings(tail)
      } else {
        filterLongStrings(tail)
      }
  }
}

  def main(args: Array[String]): Unit = {
    println("Reversed String: " + reverseString("HELLO"))

    val inputStrsings = List("Nimal", "Kamal", "BKNKNKnknas","Abcdefghijk")
    val filteredStrings = filterLongStrings(inputStrsings)
    println(filteredStrings)
  }
}
