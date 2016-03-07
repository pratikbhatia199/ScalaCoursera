package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if ( c < 0 || r < 0 )  0
    else {
      if ( c > r ) 0
      if ( c == 0 && r == 0 ) 1
      else pascal(c, r - 1) + pascal(c - 1, r - 1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var parens = List.empty[Char]
    chars match {
        case ('(') => parens = '(' :: parens
        case (')') => parens match {
          case ('(' :: xs) => parens = xs
          case _ => return false
        }
        case _ =>
      }
    parens.isEmpty
  }

  /**
   * Exercise 3
   */
  def countChange(money:Int, coins: List[Int]): Int = {
    if (coins.length == 1) {
      if (money % coins.head == 0) 1
      else 0
    }
    else
    if (money == 0 || coins.isEmpty ) 1
    else {
      val current_denomination::rest = coins
      var ways = 0
      var multiplier = 0
      while(money >= multiplier * current_denomination) {
        ways += countChange(money - multiplier * current_denomination, rest)
        multiplier += 1
      }
      ways
    }
  }
}
