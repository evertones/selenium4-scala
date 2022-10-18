package org.evertones.test.unit

import org.scalatest.{FunSpec, Ignore, Matchers}

@Ignore
class IgnoredSpec
    extends FunSpec
        with Matchers {

    describe("A new test 1") {
        it("should do 1") {
            1 shouldBe 1
        }
        it("should do 2") {
            2 shouldBe 2
        }
        it("should do 3") {
            3 shouldBe 3
        }
    }

    describe("A new test 2") {
        it("should do 1") {
            1 shouldBe 1
        }
        it("should do 2") {
            2 shouldBe 2
        }
        it("should do 3") {
            3 shouldBe 3
        }
    }

}
