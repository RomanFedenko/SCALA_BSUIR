import scala.io.StdIn
import scala.util.matching.Regex



object Main33 {
  def main(args: Array[String]): Unit = {

    /*TASK 1
    val regex = """([A-Za-z]{8}) ([A-Za-z]{2})-(\d{3})-(\d{3})""".r
    val str = "Passport AB-123-456"
    val matches = regex.findFirstMatchIn(str)

    matches match{
      case Some(m)=>println(s"Digits: ${m.group(3)} and ${m.group(4)}")
      case None => println("Matches None")
    }*/

    /*TASK2
    val str = "Being strong means nothing"

    val pattern = "([A-Za-z]+)ing".r

    val matches = pattern.findAllIn(str)

    matches.foreach(println)*/

    /*TASK3
   val str = "123+723=846"

    val newstr = str.replaceAll("3","4").replaceAll("6","8")
    println(newstr)*/


    /*TASK4
    val str = "big dreadful dog runs after small poor cat"
    val app = str.split(" ")
    println("app: "+app.mkString(" "))
    for(index<-0 until app.length){
      if(index == 0){
        val temp = app(0)
        app(0) = app(6)
        app(6) = temp
      }
      if(index == 1){
        val temp = app(1)
        app(1) = app(5)
        app(5) = temp
      }
      if(index == 3){
        val temp = app(3)
        app(3) = app(4)
        app(4) = temp
      }
    }
    println("NEW APP: "+app.mkString(" "))*/

  /*TASK5
    def removeEvery(s:String,index:Int=0):String={
      if(index>=s.length) ""
      else{
        if((index % 3!=0) || (index == 0)){
          s(index)+removeEvery(s,index+1)
        } else {
          removeEvery(s,index+1)
        }
      }
    }
    val text = "Hello to everybody"
    val rez = removeEvery(text)
    println(rez)*/
    /*TASK 6
    val text = "Hello to everybody"
    val newtext = text.replaceAll("([A-Za-z])","$0$0")
    println(newtext)*/
    /*TASK7
    val text = "Hello to everybody"
    val newtext = text.replaceAll("o","")
    println(newtext)*/

    /*TASK 8
    val text = "Hello to everybody Katty, Mikky"
    val pattern = """\b[A-Z]\w*\b""".r
    val matches = pattern.findAllMatchIn(text)
    matches.foreach(println)*/

    /*TASK DOP
    val text = "Hello to everybody Katty, Mikky"
    val pattern = """[eyuioaEYUIOA]""".r
    val matches = pattern.findAllMatchIn(text)
    var pos = 0
    for (elem <- matches)
      pos = pos + 1
    println("Elements: " + pos)*/
  }
}
