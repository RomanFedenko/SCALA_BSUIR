import scala.io.StdIn


  def FirstTaks(lst:List[Int],rez:Int):Int={
    if(lst.isEmpty) rez
    else if(lst.head>=0 && lst.head<=5){
      FirstTaks(lst.tail,rez+lst.head)
    }
    else
      FirstTaks(lst.tail,rez)
  }

  def SecondTask(rez2:Int,lst1:List[Int]): Int={
    if(lst1.isEmpty) rez2
    else
      SecondTask(rez2+lst1.head,lst1.tail)
  }
  def MakeNewList(lst1:List[Int],lst2:List[Int]): List[Int]={
    val newList=lst2.map(lst1(_))
    newList
  }

  def ThirdTask(headvalue:Int,lster:List[Int],currentPosition:Int=1,minIndex:Int=0): Int={
    if(lster.isEmpty) minIndex
    else{
      val currentElement = lster.head
      if(headvalue<currentElement) {
        ThirdTask(headvalue,lster.tail, currentPosition + 1, minIndex)
      }
      else{
        ThirdTask(currentElement,lster.tail,currentPosition+1, currentPosition)
      }
    }
  }

  def Fourth(lst:List[Int],value:Int): Boolean={
    if(lst.isEmpty) true
    else if(lst.head>value) false
    else {
      Fourth(lst.tail,value)
    }
  }



  def FifthTask(lst:List[Int],sum:Int,value:Int):Int={
    if(lst.isEmpty) sum
    else if(lst.head<value){
      FifthTask(lst.tail,sum+lst.head,value)
    }
    else{
      FifthTask(lst.tail,sum,value)
    }
  }
object Main32{

  def main(args:Array[String]):Unit={
    print("Enter first List to do first task: ")
    val firstList = StdIn.readLine().split(" ").map(_.toInt).toList
    val rez = FirstTaks(firstList,0)
    println("Sum = "+rez)
    print("Enter second List to do second task: ")
    val secondList = StdIn.readLine().split(" ").map(_.toInt).toList
    val NewListForSecondTask=MakeNewList(firstList,secondList)
    val rez2=SecondTask(0,NewListForSecondTask)
    println("Sum: "+rez2)
    val rez3=ThirdTask(secondList.head,secondList.tail)
    println("Index MinValue in secondlist: "+secondList+" it is "+rez3)
    val rez4 = Fourth(secondList,10)
    println("FOURTH TASK: "+ rez4)

    val rez5 = FifthTask(secondList,0,7)
    println("FIFTH TASK: "+ rez5)
  }
}