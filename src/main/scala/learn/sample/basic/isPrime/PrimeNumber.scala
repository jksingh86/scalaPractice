package learn.sample.basic.isPrime

object PrimeNumber{
  def main(args: Array[String]): Unit = {
    val prime = new PrimeNumberCheck
    println(prime.isPrime(34))
  }
}
