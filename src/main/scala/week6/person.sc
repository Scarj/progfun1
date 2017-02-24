object person {
  case class Person(name:String, age:Int)

  val persons:List[Person] = List[Person]()

  for (p <- persons if p.age > 20) yield p.name

}