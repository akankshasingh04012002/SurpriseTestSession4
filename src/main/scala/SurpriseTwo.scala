import scala.annotation.tailrec

object SurpriseTwo extends App {
  private val myList = List(1, 2, 3, 4, 5)

  @tailrec
  private def sum(list: List[Int], accumulator: Int): Int = {
    list match {
      case Nil => accumulator
      case head :: tail => sum(tail, accumulator + head)
    }
  }

  private val sumTotal = sum(myList, 0)
  println(sumTotal)
}
