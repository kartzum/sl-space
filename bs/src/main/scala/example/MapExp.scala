package example

object MapExp {
  def simple(): Unit = {
    val map = Map("x" -> 24, "y" -> 25, "z" -> 26)
    println(map) // Map(x -> 24, y -> 25, z -> 26)
    println(map.getOrElse("x", 0)) // 24
  }

  def main(args: Array[String]): Unit = {
    simple()
  }
}
