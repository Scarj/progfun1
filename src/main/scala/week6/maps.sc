object maps {
  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
  val capitalOfCountry: Map[String, String] = Map("US" -> "Washington", "Switzerland" -> "Bern")

  capitalOfCountry.get("US")
  capitalOfCountry get "Andorra"

  val cap1: Map[String, String] = capitalOfCountry.withDefaultValue("<unknown>")
  cap1("Andorra")

  val fruits: List[String] = List("apple", "pear", "pineapple", "orange", "banana")
  fruits.sortWith(_.length < _.length)
  fruits.sorted

  fruits.groupBy(_.head)
}