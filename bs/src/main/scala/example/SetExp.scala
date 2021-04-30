package example

import scala.collection.immutable.{HashSet, TreeSet}

object SetExp {
  def simple(): Unit = {
    // HashSet
    val hashSet: Set[Int] = HashSet(1, 2, 3, 3, 3)
    println(hashSet) // HashSet(1, 2, 3)
    // TreeSet
    val treeSet = TreeSet(1, 2, 3, 4, 5, 5, 5)
    println(treeSet) // TreeSet(1, 2, 3, 4, 5)
  }

  def main(args: Array[String]): Unit = {
    simple()
  }
}
