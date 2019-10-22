import scala.collection.mutable.ArrayBuffer

object AllSimpleValues extends App {
  def eratosphene(numb: Int): Unit = {
    /*Функция выводит все простые числа до числа numb
     */
    if (numb < 1) {
      println("Все числа в диапазоне до " + numb + " не являются простыми")
      return
    }
    if (numb > 46348) {
      println("число больше диапазона массива, как создать массив длиннее 46348^2 пока не разобрался")
      return
    }
      val boolArray: Array[Boolean] = new Array[Boolean](numb+1) // массив для решета Эратосфена
    val resultArray = new ArrayBuffer[Int]() //создание буфера для результирующего массива
    boolArray(0) = false
    boolArray(1) = false
    for (i <- 2 until boolArray.length) {
      boolArray(i) = true //изначально в массиве Эратосфена все значения true, кроме 0 и 1 элементов
    }
    for (j <- 2 until boolArray.length){
      if (boolArray(j)) for (k <- j*j until (boolArray.length,j)){
        boolArray(k) = false  //заполнение массива решета Эратосфена
      }
    }
    for (l <- boolArray.indices){
      if (boolArray(l)) resultArray += l  //результирущий массив чисел до заданного numb
    }
    print("Простые числа в диапазоне до "+ numb + ": " + resultArray.mkString(" "))
  }

  eratosphene(numb = 100) //Вызов функции поиска всех простых менше заданного numb
}