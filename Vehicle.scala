class Vehicle(var vnum:Int, i:Int, j:Int) {

    var vehicleNum: Int = vnum
    def this()={
      this(0,0,0)
    }
    def this(i:Int, j:Int) = {
    this ( 0,i,j)
  }
  def this (i:Int) = {
    this(i,0)
    //this ( i,0,0)
  }

  println("Creating vehicle object ... " + vnum)

    val meth1 = (i:Int, j:Int)  => {
          val k=5
          k
    }

  private def getVehicleNum ( ): Unit = {
    this.vehicleNum
  }

  def getvnum() : Int = {
    this.vnum
  }

  def get_i: Unit = {
    this.i
  }

  def get_j: Unit = {
    this.j
  }

  def set_vnum(vnum:Int) : Unit = {
    this.vnum = vnum
  }

  def method2(): Unit = {
    println("This is method2")
    getVehicleNum()
  }



}
