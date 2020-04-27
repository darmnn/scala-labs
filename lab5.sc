//Часть1: найти длину самого длинного слова в списке

//без хвостовой рекурсии
def list = Vector("hello", "helicopter", "exponential")
var max = 0
for(str <- list) if(str.length > max) max = str.length
max

//хвостовая рекурсия
def countLen(str: String, max: Int) = if (max < str.length) str.length else max
def findMaxLen(list: Vector[String], max: Int, i: Int):Int =  if(i == list.length) max else findMaxLen(list, countLen(list.apply(i), max), i+1)
findMaxLen(Vector("electricity", "sun", "paper", "biology"), 0, 0)

//Часть2: перевести число в двоичную систему счисления
//хвостовая рекурсия
def toBinary(num: Int, res: String):Int =  if(num <= 0) (res.reverse).toInt else toBinary(num/2, res+(num%2))
toBinary(22, "")

//без хвостовой рекурсии
def toBinary2(num: Int, res: String):String = if(num <= 0) res else res +(num%2) + toBinary2(num/2, res)
toBinary2(22, "").reverse.toInt




