import scala.collection.mutable.ListBuffer

object lab6 extends App
{
    //Часть 1.Разделить коллекцию на две. В первой должны быть только положительные элементы, а во второй только отрицательные

    def getPos(list:List[Int]):List[Int] =
    {
        val posList = new ListBuffer[Int]()
        for(el <- list) if(el > 0) posList += el
        posList.toList
    }

    def getNeg(list:List[Int]):List[Int] =
    {
        val negList = new ListBuffer[Int]()
        for(el <- list) if(el < 0) negList += el
        negList.toList
    }

    val list = List(4, -5, 12, -654, 45, -98, 0, -34, 123, 87, -64, 234)
    val positiveList = getPos(list)
    val negativeList = getNeg(list)

    println(positiveList)
    println(negativeList)

    //Часть 2.	Подсчитать среднее значение элементов в List[Double].

    def average(list: List[Double]):Double =
    {
        list.foldLeft(0.0)((m: Double, n: Double) => m + n)/list.length
    }

    val arr = List(5.0, 2.0, 9.0, 0.0, 10.0)
    println(average(arr))

    //Часть 3.	На основе List[String] сгенерировать строку, сконкатенированную через ' ' из тех подстрок List, которые начинаются с заглавной буквы.

    def getUpper(list: List[String]) =
    {
        var res = ""
        val newList = list.filter(_.charAt(0).isUpper)
        for(el <- newList)  res += el + " "
        res
    }

    val result = getUpper(List("Hey!", "I am a", "lazy but", "Clever", "Guy!"))
    println(result)
}
