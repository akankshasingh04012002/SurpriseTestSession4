case class ListOperations(numbers: String, isEven: Boolean)

object abc extends App {

  private val list = List(
    ListOperations("1", false),
    ListOperations("2", true),
    ListOperations("3", false),
    ListOperations("4", true),
    ListOperations("5", false)
  )

  //Even numbers
  private val evenFields = list.filter(number => number.isEven)
  println(evenFields)

  //only first field of case class for even numbers
  private val firstField = evenFields.map(number => number.numbers)
  println(firstField)

  //odd numbers
  private val oddFields = list.filter(!_.isEven)
  println(oddFields)

  //use of partition
  private val (evenNum, oddNum) = list.partition(_.isEven)
  println(evenNum)
  println(oddNum)

}
