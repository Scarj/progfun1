import week4.{Nat, Zero}

object Nats {
  val one: Nat = Zero.successor
  val two: Nat = one.successor
  val three: Nat = two.successor
  val four: Nat = three.successor
  val five: Nat = four.successor
  val six: Nat = five.successor

  (one + two) == four

}