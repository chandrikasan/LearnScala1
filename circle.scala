object circle {
  def main(args:Array[String]) :Unit= {
    println("Hello")
    var radius:Int = 20
    val perimeter = 2 * 3.14 * radius
    val ar = areaFunc(radius)
    println(s"Perimeter: ${perimeter}  Area: ${ar}")
    val list1 = List(1 to 100)
  }

  val areaFunc = (r:Int)  => {
    val ar = 3.14 * r * r
    ar
  }

}
