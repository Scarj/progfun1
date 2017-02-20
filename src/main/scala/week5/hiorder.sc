def squareList(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case y :: ys => y * y :: squareList(ys)
}


def squareList2(xs: List[Int]): List[Int] = {
  xs.map(x => x * x)
}

def posElem(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case y :: ys =>
    if (y > 0) y :: posElem(ys) else posElem(ys)
}

def posElem2(xs: List[Int]): List[Int] = {
  xs.filter(x => x > 0)
}



val list: List[Int] = List(-3, -2, -1, 0, 1, 2, 3)

squareList(list)
squareList2(list)
posElem2(list)
