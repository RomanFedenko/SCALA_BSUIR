import scala.io.StdIn


//Объединить два списка через голова хвост через рекурсию.
//Нужно два списка, л1 делим и голову заносим в л2

  def Task(lst1:List[Int],lst2:List[Int]):List[Int]={
    if(lst1.isEmpty) lst2
    else{
      Task(lst1.tail,lst2 :+ lst1.head)
    }
  }

  def MaxElem(lst:List[Int],maxElem:Int):Int={
    if(lst.isEmpty) maxElem
    else if(maxElem>lst.head){
      MaxElem(lst.tail,maxElem)
    }
    else{
      MaxElem(lst.tail,lst.head)
    }
  }
object MainDop32 {

  def main(args:Array[String]): Unit = {
    val list1 = List(12,11,3,4)
    val list2 = List(55,4,7,0)
    val newList = Task(list1,list2)
    println(newList)
    val maxelem=MaxElem(newList.tail,newList.head)
    println("MaxElem: "+ maxelem)
  }
}
