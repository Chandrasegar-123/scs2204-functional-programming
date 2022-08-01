package tutorial_4

object Q2 {

  def Pattern_matching(num:Int):Unit = num match {
    case x if x <= 0 && x%2 == 0 => println("Negative/Zero and Even")
    case x if x <= 0 && x%2 != 0 => println("Negative/Zero and Odd")
    case x if x>0 && x%2 == 0 => println("Positive and Even")
    case x if x>0 && x%2 !=0 => println("Positive and Odd")
  }

  def main(args:Array[String]):Unit = {
    printf("Enter a number: ")
    val num = scala.io.StdIn.readInt()
    Pattern_matching(num)
  }
}
