package learn.sample.basic.isPrime

object PrimeNumCheckObject{
  def main(args: Array[String]): Unit = {
    val prime = new PrimeNumCheckObject(31)
    println(prime isPrime)
  }
}

case class PrimeNumCheckObject(num:Int = 2) {
  def isPrime: Boolean =
    if (num <= 1)
      false
    else if (num == 2)
      true
    else
      !(2 until num).exists(n => num % n == 0)
}
