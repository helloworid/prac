package com.my.scala.basic

import scala.reflect.internal.util.StringOps

object DemoString {
  def main(args: Array[String]): Unit = {

    printf("%s今年%d", "aa", 14)

    val sql:String =
      """
        |select *
        |from table
        |where a = a
      """.stripMargin
    println(sql)

    StringOps
  }

}
