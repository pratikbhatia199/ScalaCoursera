
var x = List(1, 2, 3, 4)
val (head, rest) = x match { case x::xs => (x, xs)}
def balance(chars: List[Char]): Boolean = {
  var parens = List.empty[Char]
  chars map(
     _ match {
      case ('(') => parens = '(' :: parens
      case (')') => parens match {
        case ('(' :: xs) => parens = xs
        case _ => return false
      }
      case _ =>
    }
  )
  parens.isEmpty
}


val answer: Boolean = balance(List('(', ')','(', ')'))
println(answer)

