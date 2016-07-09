package io.btforsythe.scala_n00b.fizzBuzz

/**
 * Really this represents the students in the class. Should I rename it?
 */
class FizzBuzz {	
	
	var current:Int = 0
	
  def pointAtStudent() = {
  	current += 1
  	
  	current match {
  		case 3 => "fizz"
  		case 5 => "buzz"
  		case _ => currentAsString
  	}
  }
	
	def currentAsString:String = { s"$current" }
}