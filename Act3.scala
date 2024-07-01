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
  def Average(num1:Int,num2:Int):Float ={
    (num1 + num2) / 2.0f
  }

  def sumEven(numbers:List[Int]):Int ={
    numbers match{
      case Nil => 0
      case head:: tail=>
        if(head% 2 == 0){
          head +sumEven(tail)
        }else{
          sumEven(tail)
        }
    }
  }


  def main(args: Array[String]): Unit = {
    println("Reversed String: " + reverseString("HELLO"))

    val inputStrsings = List("Nimal", "Kamal", "BKNKNKnknas","Abcdefghijk")
    val filteredStrings = filterLongStrings(inputStrsings)
    println(filteredStrings)

    var num1 = 67
    var num2 = 78
    printf("Arithmetic mean of %d and %d = %.2f\n",num1,num2,Average(num1,num2))
  
    val inputNumbers = List(1, 2, 3, 4, 5, 6)
    val sumOfEvens = sumEven(inputNumbers)
    println(sumOfEvens)
  }  

}
