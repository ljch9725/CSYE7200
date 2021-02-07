
//def reverse(xs: Seq[Int]): Seq[Int] = {
//  xs match {
//    case Nil => Nil
//    case head :: tail => reverse(tail) :+ head
//  }
//
//}
//
//reverse(List(1, 2, 3, 4))
//def third(xs: Seq[Int]): Seq[Int] = {
//  xs match {
//    case Nil => Nil
//    case _ :: _ :: tail => tail
//  }
//}
//
//third(List(1, 2, 3, 4))

//def drop(xs: Seq[Int])(n: Int): Seq[Int] = xs -> n match {
//  case (Nil, _) => Nil
//  case (ys, 0) => ys
//  case (_ :: tail, m) if m > 0 => drop(tail)(m - 1)
//  case _ => throw new RuntimeException("logic error")
//}
//
//drop(List(1, 2, 3, 4))(2)

def log[X](x: X)(messageFunction: X => String): X = {
  val w: String = messageFunction(x)
  println(w)
  x
}

def xToString[Any](x: Any): String = s"result $x"

val x = log(Math.PI * Math.PI)(xToString _)

val logSimple: (Double => Double) = log(_)(xToString)
val y = logSimple(Math.PI * Math.PI)
