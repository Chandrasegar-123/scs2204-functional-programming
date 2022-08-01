package tutorial_4

object Q1 {
  def interest(deposit: Int): Double = deposit match {
    case x if x <= 20000 => x * 0.02
    case x if x <= 200000 => x*0.04
    case x if x <= 2000000 => x*0.035
    case x if x > 2000000 => x*0.065


  }

  def main(args: Array[String]): Unit = {
    println(interest(250000));
  }
}
