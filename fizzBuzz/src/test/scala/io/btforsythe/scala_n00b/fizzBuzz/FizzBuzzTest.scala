package io.btforsythe.scala_n00b.fizzBuzz

import org.scalatest.Spec
import org.scalatest.BeforeAndAfterEach
import org.scalatest.BeforeAndAfter
import org.scalatest.FunSpec
import org.scalatest.GivenWhenThen
import org.scalatest.FreeSpec

/**
 * Don't like the capitalized method names, but sticking with the convention established by GivenWhenThen.
 */
class FizzBuzzTest extends FreeSpec with GivenWhenThen with BeforeAndAfterEach {

	var underTest: FizzBuzz = null

	var studentResponse: String = null

	override def beforeEach() = { underTest = new FizzBuzz }
	
	"Maths class" - {

		"should say the current number" - {

			"for the first number" in {

				GivenTheTeacherPointsAtStudent(1)

				ThenTheStudentShouldSay("1")

			}

			"for the second number" in {

				GivenTheTeacherPointsAtStudent(2)

				ThenTheStudentShouldSay("2")

			}
		}

		"should say 'fizz'" - {

			"for the third number" in {
				
				GivenTheTeacherPointsAtStudent(3)

				ThenTheStudentShouldSay("fizz")
			}
		}
	}
	
	def GivenTheTeacherPointsAtStudent(nth:Int) = {
		Given(s"the teacher points at student $nth")
		for (i <- 1 until nth) {
			underTest.pointAtStudent()
		} 
		studentResponse = underTest.pointAtStudent()
	}
	
	def ThenTheStudentShouldSay(expectedResponse:String) = {
		Then(s"he should say '$expectedResponse'")
		assert(studentResponse == expectedResponse)
	}
}