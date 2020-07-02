package learn.sample.basic.isPrime

class PrimeNumberCheck {
  def isPrime(num: Int): Boolean =
    if (num <= 1)
      false
    else if (num == 2)
      true
    else
      !(2 until num).exists(n => num % n == 0)
}