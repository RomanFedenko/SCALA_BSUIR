object Main51{
 def main(name: Array[String]): Unit= {
   var A: Long=0
   var B: Long=0
   var C: Long = 0
   var RandomNumber: Float = 0.0
   println(s"Enter the hexidecimal number")
   var Z = scala.io.StdIn.readLine()
   if(Z.length()!=16 || !Z.forall(_.isDigit))
   { 
     println(s"Number doesn't have length")
     sys.exit(0)
   }
   for(i <- 1 to 5) {
   if(Z.length > 16 || Z.toLong<0)
   {
     Z=Z.reverse.substring(0,16).reverse
   }
   A=Z.substring(0,8).toLong
   B=Z.substring(8,16).toLong
   C=A*B
   RandomNumber=C.toString().substring(0,3).toFloat /1000
   println(A)
   println(B)
   println(C)
   println("RandomNumber: "+RandomNumber)
   println("z:"+Z)
   Z = (Z.toLong*C).toString
   }
}
}