package io.btforsythe.scala_n00b.fizzBuzz

import org.scalatest.Spec
import org.scalatest.BeforeAndAfterEach
import org.scalatest.BeforeAndAfter
import org.scalatest.FunSpec
import org.scalatest.GivenWhenThen
import org.scalatest.FreeSpec

class FizzBuzzTest extends FreeSpec with GivenWhenThen with BeforeAndAfterEach {

	var underTest: FizzBuzz = null

	var studentResponse: String = null

	override def beforeEach() = { underTest = new FizzBuzz }
	
	"Maths class" - {

		"should say the current number" - {

			"for the first number" in {

				Given("the first student is pointed at")
				studentResponse = underTest.pointAtStudent()

				Then("he should say 1")
				assert(studentResponse == "1")

			}

			"for the second number" in {

				Given("the second student is pointed at")
				underTest.pointAtStudent()
				studentResponse = underTest.pointAtStudent()

				Then("he should say 2")
				assert(studentResponse == "2")

			}
		}

		"should say 'fizz'" - {

			"for the third number" in {
				
				Given("the third student is pointed at")
				underTest.pointAtStudent()
				underTest.pointAtStudent()
				studentResponse = underTest.pointAtStudent()

				Then("he should say 'fizz'")
				assert(studentResponse == "fizz")
				
			}
		}
	}
}