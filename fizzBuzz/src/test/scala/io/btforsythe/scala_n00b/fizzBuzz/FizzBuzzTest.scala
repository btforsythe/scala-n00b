package io.btforsythe.scala_n00b.fizzBuzz

import org.scalatest.Spec
import org.scalatest.BeforeAndAfterEach
import org.scalatest.BeforeAndAfter
import org.scalatest.FunSpec
import org.scalatest.GivenWhenThen

class FizzBuzzTest extends FunSpec with GivenWhenThen {

	var underTest: FizzBuzz = null

	var studentResponse: String = null

	describe("Maths class") {

		describe("should say the current number") {

			describe("for the first number") {

				Given("the first student is pointed at")
				underTest = new FizzBuzz

				When("the student speaks")
				studentResponse = underTest.speak()

				Then("he should say 1")
				assert(studentResponse == "1")
				
			}			
		}
	}
}