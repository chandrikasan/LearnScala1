import java.io.{BufferedReader, FileReader, FileWriter}

import scala.io.Source


object FileIODemo {
    def main(args: Array[String]): Unit = {

      val srcFile = Source.fromFile("C:\\student.txt")

      for ( line <- srcFile.getLines()) {
        println(line)
      }

      val srcFile2= new FileReader("C:\\student.txt")

      val bufferedReader = new BufferedReader(srcFile2)

      println()
      var line:String = ""
      line = bufferedReader.readLine()
      val destFile = new FileWriter("C:\\Users\\Chandrika Sanjay\\testFileScala.txt")
      while (line  != null )
      {
        destFile.write(line + "\n")
        println( line )
        line=bufferedReader.readLine()
      }

      destFile.close()
      srcFile.close()
    }
  }

