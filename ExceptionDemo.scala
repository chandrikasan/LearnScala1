import scala.collection.mutable.ArrayBuffer

object ExceptionDemo {
  def main(args: Array[String]): Unit = {

  var arrayofNum=ArrayBuffer[Int]()
  arrayofNum += 11
  arrayofNum += 12
  arrayofNum += (13,14,15)
  println(arrayofNum)
  try {
    println(arrayofNum(5))
  }
  catch {
    case e: IndexOutOfBoundsException => println(s"Index not available in the array $e")
    case e: Exception => println(s"Exception $e")
  }
  finally {
  println("This loop will be executed in any case")
  }
    println("TEST STATEMENT")
  }



}
