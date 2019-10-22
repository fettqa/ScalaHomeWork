import scala.collection.mutable.ArrayBuffer

object Fibonachi extends App {
  val fibArray: ArrayBuffer[Int] = new ArrayBuffer[Int]()
  fibArray+= 0 //заполняем 1й элемент массива чисел Фибоначчи
  fibArray+= 1 //заполняем 2й элемент массива чисел Фибоначчи
  def fibonachiValues(numb: Int): Unit = {
    """Функция выводит значение всех чисел Фибоначчи до числа numb"""
    if (numb < 0) {
      println("numb отрицательный")
      return
    }
    def fib (j:Int = 1):Unit ={
      fibArray+= fibArray(j)+fibArray(j-1) //Добавляем в конец массива сумму 2х предыдущих чисел Фибоначчи
      if (fibArray(j+1) <= numb) fib(j+1)  //Сравнение крайнего элемента массива с заданным числом numb, вход в рекурсию
    }
    fib()
    fibArray.trimEnd(1) //Удаление последнего элемента массива, поскольку он у меня всегда выходит за диапазон во время выполнения рекурсии
    print("Числа Фибоначчи, входящие в диапазон до " + numb + " : " + fibArray.mkString(" "))

  }
  fibonachiValues(numb = -100)
}
