package example

/**
 * https://docs.scala-lang.org/overviews/collections/overview.html
 * https://www.scala-lang.org/api/2.12.13/scala/collection/Traversable.html
 * https://www.scala-lang.org/api/2.12.13/scala/collection/immutable/List.html
 * https://www.oreilly.com/library/view/learning-scala/9781449368814/ch06.html
 */

object TraversableIterableExp {
  def simple(): Unit = {
    val seqList: Iterable[Int] = List(3, 2, 1)
    seqList.map(f => f * 2).foreach(x => print(x + " ")) // 6 4 2
  }

  def mainOps(): Unit = {
    val seqList: Iterable[Int] = List(3, 2, 1)

    seqList.foreach(x => print(x + " ")) // 3 2 1
    println()
    seqList.map(x => x * 2).foreach(x => print(x + " ")) // 6 4 2
    println()
    val sum: Int = seqList.reduce((a, b) => a + b)
    println(sum) // 6
    println(seqList.head) // 3
    println(seqList.tail) // List(2, 1)
    val element: Option[Int] = seqList.find(x => x == 2)
    println(element.getOrElse(0)) // 2
    seqList.filter(x => x % 2 == 0).foreach(x => print(x + " ")) // 2
  }

  def main(args: Array[String]): Unit = {
    // simple()
    mainOps()
  }
}
