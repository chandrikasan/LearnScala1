import scala.io.StdIn._

object ReflectionTest {
  def main(args: Array[String]): Unit = {

    println("Enter string : ")
    val str1 = readLine()

    val len = str1.length

    var leftstr=""
    for ( i <- 0 to len / 2 - 1) {
      leftstr += str1(i)
    }
    println(leftstr)
    var rightstr=""
    if(len % 2 != 0 ) {
      for (i <- len / 2 + 1 to len - 1) {
        rightstr += str1(i)
      }
    }
    else{
      for (i <- len / 2  to len - 1) {
        rightstr += str1(i)
      }
    }

    println(rightstr)

    var leftSet:Set[Char] = Set()

    for ( i <- 0 to leftstr.length - 1) {
      println("i: " + leftstr.charAt(i))
      leftSet += leftstr.charAt(i)
    }

    var rightSet:Set[Char] = Set()

    for ( i <- 0 to rightstr.length - 1 ) {
      println("i: " + rightstr.charAt(i))
      rightSet += rightstr.charAt(i)
    }

    if (leftSet.equals(rightSet)) {
      println(str1 + " passes the reflection test")
    }
    else {
      println(str1 + " doesnt pass the reflection test")
    }

  }

}
