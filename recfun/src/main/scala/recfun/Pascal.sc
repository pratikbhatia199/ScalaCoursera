
def pascal(c: Int, r: Int): Int = {
  if (c < 0 || r < 0)  0
  else {
    if (c > r) 0
    if (c == 0 && r == 0) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }
}


//pascal(0,0)
pascal(2, 4)
//
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1