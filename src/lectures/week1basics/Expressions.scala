package lectures.week1basics

object Expressions extends App {
  val aCondition = true;

  val ifExpressionValue = if (aCondition) {
    "True Condition"
  } else "False Condition"
  println(ifExpressionValue); // выведет True Condition

  println(if(aCondition) "True Condition" else "False Condition") // выведет True Condition

  val someVal: Unit = print("I just want to print")
}
