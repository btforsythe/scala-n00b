package io.btforsythe.scala_n00b.fizzBuzz

/**
 * Really this represents the students in the class. Should I rename it?
 */
class FizzBuzz {	
	
	var current:Int = 0
	
  def pointAtStudent() = {
  	current += 1
  	
  	if(current == 3) "fizz" else currentAsString
  }
	
	def currentAsString:String = { s"$current" }
}