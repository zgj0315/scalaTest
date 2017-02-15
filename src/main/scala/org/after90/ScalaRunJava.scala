package org.after90

import org.after90.utils.FuncUtil

/**
  * Created by zhaogj on 15/02/2017.
  */
object ScalaRunJava {
  def main(args: Array[String]): Unit = {
    val nRandom = FuncUtil.getRandom(10)
    print(nRandom)
  }
}
