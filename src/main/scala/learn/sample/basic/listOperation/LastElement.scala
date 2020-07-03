package learn.sample.basic.listOperation

object LastElement {

  def main(args: Array[String]): Unit = {
    val before1= System.nanoTime()
    println(before1)
    println(lastRecursive(List(1,2,3,4,5,6)))
    val after1= System.nanoTime()
    println(after1-before1)
    println(lastBuiltin(List(1,2,3,4,5,6)))
    val after2= System.nanoTime()
    println(after2-after1)
  }

  // There are several ways to solve this problem.  If we use builtins, it's very
  // easy.
  def lastBuiltin[A](ls: List[A]): A = ls.last

  // The standard functional approach is to recurse down the list until we hit
  // the end.  Scala's pattern matching makes this easy.
  @scala.annotation.tailrec
  def lastRecursive[A](ls: List[A]): A = {
    ls match {
      case h :: Nil  => h
      case _ :: tail => lastRecursive(tail)
      case _         => throw new NoSuchElementException
    }
  }
}