object Permutations extends App {
  def permutation(list: List[String] = null): Unit =
  {
    println(list.permutations.mkString("\n"))
  }
  permutation(List("do","did","done")) // Вызов метода, генерирующего все возможные комбиназии списка List
}
