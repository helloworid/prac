package com.my.scala.basic

object DemoFunc {
  def main(args: Array[String]): Unit = {

    def func1(name: String, args: String*){
      args.foreach(println)
    }

    def func2(age:Int = 10, name:String): Unit ={

    }


    def func3(f:(Int)=>Unit): Unit ={
      f(123)
    }


    println(1 * 3)
//    func2(name = "a")
//
//    func1(name = "a", "a", "b", "c")

  }
}
