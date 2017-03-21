package org.after90.scala

import scala.xml.XML

/**
  * Created by zhaogj on 21/03/2017.
  */
object ReadXML {
  def main(args: Array[String]): Unit = {
    val someXml = XML.loadFile("./data/fairscheduler.xml")
    println(someXml)
    val pool = someXml \\ "pool"

    println(pool)
  }
}
