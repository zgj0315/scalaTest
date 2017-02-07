package org.after90.scala

/**
  * Created by zhaogj on 07/02/2017.
  */
object SomeTest {
  def main(args: Array[String]): Unit = {
    val a, b, c, d = List(1)
    //a ? b ? c ? d apply (_ + _ + _ + _)
    //a |@| b |@| c |@| d apply (_ + _ + _ + _)
  }
}
