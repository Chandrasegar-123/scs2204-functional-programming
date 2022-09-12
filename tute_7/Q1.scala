package tute_7

object Q1 extends App {
  val a = new Rational(1, 3)
  val b = new Rational(-4, 9)

  println(a.neg)
  println(b.neg)

}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def neg = new Rational(-this.numer, this.denom)

  override def toString(): String = numer + " / " + denom

}
