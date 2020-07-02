package learn.sample.basic.fibonnaci

object PrintFibonnaci {

  def main(args: Array[String]): Unit = {
    val fibonnaci = new PrintFibonnaci(12)
    fibonnaci.printFibonnaciSeriesUptoN()
  }
}

 class PrintFibonnaci(num:Int=6){
  def printFibonnaciSeriesUptoN():Unit={

    var first = 0
    var second = 1
    var count = 0
    println(first)
    println(second)
    while(count < num){
      val sum = first + second
      println(sum)
      first = second
      second = sum
      count = count + 1
    }
  }

  def printFibonnaciSeriesUsingMap():Unit={

    //val nums = Array(1,2,3,4,5,6)
    var currentMinusTwo = 0
    var currentMinusOne = 1
    var sum = 0
    (2 until num).map(n => {
      if(n == 1) {
        sum = 0
      } else if(n == 2) {
        sum = 1
      } else {
        sum = currentMinusTwo + currentMinusOne
        currentMinusTwo = currentMinusOne
        currentMinusOne = sum
      }
      sum
    })
  }
}