package example

/**
 * https://www.oreilly.com/library/view/learning-scala/9781449368814/ch06.html
 */

object SeqExp {
  def simple(): Unit = {
    val listA = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(listA) // List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val listB = 3 :: 2 :: 1 :: Nil
    println(listB) // List(3, 2, 1)
    println(listA.head == listB.last) // true
  }

  def arithmetic(): Unit = {
    // ::
    println(1 :: 2 :: Nil) // List(1, 2)
    // :::
    println(List(1, 2) ::: List(2, 3)) // List(1, 2, 2, 3)
    // ++
    println(List(1, 2) ++ Set(3, 4, 3)) // List(1, 2, 3, 4)
    // ==
    println(List(1, 2) == List(1, 2)) // true
    println(List(1, 2) == List(1, 3)) // false
    // distinct
    println(List(3, 5, 4, 3, 4).distinct) // List(3, 5, 4)
  }

  def main(args: Array[String]): Unit = {
    // simple()
    arithmetic()
  }
}
