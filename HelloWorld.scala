object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val a = new Animals(3,4)
    var i=10.5d

    val (myVar1, myVar2, myVar3) = Tuple3(40,  3.5f, "Foo")

    println(myVar1)
    println(myVar2)
    println(myVar3)

    i=15

    val v3:Vehicle = new Vehicle(3,4,5)

    println("Vehicle num: " + v3.getvnum())
    println("Vehicle num:" + v3.vehicleNum)
    val v = new Vehicle(5)
    println("Vehicle num: " + v.vehicleNum)
    val v1 = new Vehicle()
    println("Vehicle num: " + v1.vehicleNum)
    val v2 = new Vehicle(5,10)
    println("Vehicle Num: "+ v2.vehicleNum)
    val t = Tuple1(2,3,4)
  }

}
