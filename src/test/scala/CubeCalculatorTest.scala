import org.scalactic.source
import org.scalactic.source.Position
import org.scalatest.funspec.AnyFunSpec

class CubeCalculatorTest extends AnyFunSpec {
  val list = List(1, 2, 3)
  val param = "Test"

  describe("Suite") {
    list.foreach(v => {
      it(s"test in a foreach: $v") {
        fail()
      }
    })

    it(s"test using variable $param") {
      fail()
    }

    customDescribe {
      it("test inside custom function") {
        fail()
      }
    }

    it("working test") {
      fail()
    }
  }

  def customDescribe(fun: => Unit)(implicit pos: Position): Unit = describe("Custom describe")(fun)
}

