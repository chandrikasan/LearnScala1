object ToSeq {
  def main(args: Array[String]): Unit = {
    val str1 = "name,age,sal,city"
    println(str1.split(",").mkString(":"))
    println(sum(1,2,3,4,5))
    val xs = List(1, 2, 3)
    println(sum(xs : _*))
  }

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args)  {
      result += arg
    }
    result
  }

}
