package example

/**
 * https://docs.scala-lang.org/overviews/collections/overview.html
 * https://www.scala-lang.org/api/2.12.13/scala/collection/Traversable.html
 * https://www.scala-lang.org/api/2.12.13/scala/collection/immutable/List.html
 */

object TraversableIterableExp {
  def simple(): Unit = {
    val seqList: Iterable[Int] = List(3, 2, 1)
    seqList.map(f => f * 2).foreach(x => print(x + " ")) // 6 4 2
  }

  def main(args: Array[String]): Unit = {
    simple()
  }
}
