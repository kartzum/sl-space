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
    // ::. Appends individual elements to this list.
    println(1 :: 2 :: Nil) // List(1, 2)
    // :::. Prepends another list to this one.
    println(List(1, 2) ::: List(2, 3)) // List(1, 2, 2, 3)
    // ++. Appends another collection to this list.
    println(List(1, 2) ++ Set(3, 4, 3)) // List(1, 2, 3, 4)
    // ==. Returns true if the collection types and contents are equal.
    println(List(1, 2) == List(1, 2)) // true
    println(List(1, 2) == List(1, 3)) // false
    // distinct. Returns a version of the list without duplicate elements.
    println(List(3, 5, 4, 3, 4).distinct) // List(3, 5, 4)
    // drop. Subtracts the first n elements from the list.
    println(List('a', 'b', 'c', 'd').drop(2)) // List(c, d)
    // filter. Returns elements from the list that pass a true/false function.
    println(List(23, 8, 14, 21).filter(_ > 18)) // List(23, 21)
    // flatten. Converts a list of lists into a single list of elements.
    println(List(List(1, 2), List(3, 4)).flatten) // List(1, 2, 3, 4)
    // partition. Groups elements into a tuple of two lists based on the result of a true/false function.
    println(List(1, 2, 3, 4, 5).partition(_ < 3)) // (List(1, 2),List(3, 4, 5))
    // reverse. Reverses the list.
    println(List(1, 2, 3).reverse) // List(3, 2, 1)
    // slice. Returns a segment of the list from the first index up to but not including the second index.
    println(List(2, 3, 5, 7).slice(1, 3)) // List(3, 5)
    // sortBy. Orders the list by the value returned from the given function.
    println(List("apple", "to").sortBy(_.size)) // List(to, apple)
    // sorted. Orders a list of core Scala types by their natural value.
    println(List("apple", "to").sorted) // List(apple, to)
    // splitAt. Groups elements into a tuple of two lists based on if they fall before or after the given index.
    println(List(2, 3, 5, 7).splitAt(2)) // (List(2, 3),List(5, 7))
    // take. Extracts the first n elements from the list.
    println(List(2, 3, 5, 7, 11, 13).take(3)) // List(2, 3, 5)
    // zip. Combines two lists into a list of tuples of elements at each index.
    println(List(1, 2).zip(List("a", "b"))) // List((1,a), (2,b))
  }

  def mapping(): Unit = {
    // collect. Transforms each element using a partial function, retaining applicable elements.
    println(List(0, 1, 0) collect { case 1 => "ok" }) // List(ok)
    // flatMap. Transforms each element using the given function and “flattens” the list of results into this list.
    println(List("milk,tea") flatMap (_.split(','))) // List(milk, tea)
    // map. Transforms each element using the given function.
    println(List("milk", "tea") map (_.toUpperCase)) // List(MILK, TEA)
  }

  def reducing(): Unit = {
    // max. Finds the maximum value in the list.
    println(List(41, 59, 26).max) // 59
    // min. Finds the minimum value in the list.
    println(List(10.9, 32.5, 4.23, 5.67).min) // 4.23
    // product. Multiplies the numbers in the list.
    println(List(5, 6, 7).product) // 210
    // sum. Sums up the numbers in the list.
    println(List(11.3, 23.5, 7.2).sum) // 42.0
    // contains. Checks if the list contains this element.
    println(List(34, 29, 18) contains 29) // true
    // endsWith. Checks if the list ends with a given list.
    println(List(0, 4, 3) endsWith List(4, 3)) // true
    // exists. Checks if a predicate holds true for at least one element in the list.
    println(List(24, 17, 32) exists (_ < 18)) // true
    // forall. Checks if a predicate holds true for every element in the list.
    println(List(24, 17, 32) forall (_ < 18)) // false
    // startsWith. Tests whether the list starts with a given list.
    println(List(0, 4, 3) startsWith List(0)) // true
    // fold. Reduces the list given a starting value and a reduction function.reduction function.
    println(List(4, 5, 6).fold(0)(_ + _)) // 15
    // foldLeft. Reduces the list from left to right given a starting value and a reduction function.
    println(List(4, 5, 6).foldLeft(0)(_ + _)) // 15
    // foldRight. Reduces the list from right to left given a starting value and a reduction function.
    println(List(4, 5, 6).foldRight(0)(_ + _)) // 15
    // reduce. Reduces the list given a reduction function, starting with the first element in the list.
    println(List(4, 5, 6).reduce(_ + _)) // 15
    // reduceLeft. Reduces the list from left to right given a reduction function, starting with the first element in the list.
    println(List(4, 5, 6).reduceLeft(_ + _)) // 15
    // reduceRight. Reduces the list from right to left given a reduction function, starting with the first element in the list.
    println(List(4, 5, 6).reduceRight(_ + _)) // 15
    // scan. Takes a starting value and a reduction function and returns a list of each accumulated value.
    println(List(4, 5, 6).scan(0)(_ + _)) // List(0, 4, 9, 15)
    // scanLeft. Takes a starting value and a reduction function and returns a list of each accumulated value from left to right.
    println(List(4, 5, 6).scanLeft(0)(_ + _)) // List(0, 4, 9, 15)
    // scanRight. Takes a starting value and a reduction function and returns a list of each accumulated value from right to left.
    println(List(4, 5, 6).scanRight(0)(_ + _)) // List(15, 11, 6, 0)
  }

  def main(args: Array[String]): Unit = {
    // simple()
    // arithmetic()
    // mapping()
    reducing()
  }
}
