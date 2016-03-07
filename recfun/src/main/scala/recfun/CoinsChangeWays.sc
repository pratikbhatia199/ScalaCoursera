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

countChange(100, List(50, 25, 10, 5, 1))

