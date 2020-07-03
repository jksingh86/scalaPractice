package learn.sample.basic.listOperation

object ListBasics {

  def last(value: List[Int]):Int = {
    value.last
  }

  def main(args: Array[String]): Unit = {
    val lst = last(List(1, 1, 2, 3, 5, 8))
    println(lst)
  }

  def penultimate(value: List[Int]):Int = {
    ???
  }

  penultimate(List(1, 1, 2, 3, 5, 8))
}
