object Combinations extends App {
  def combination(list: List[String] = null): Unit =
  {
    println(list.combinations(2).mkString("\n"))
  }
  combination(List("do","did","done")) // Вызов метода, генерирующего все подстановки списка List
}
