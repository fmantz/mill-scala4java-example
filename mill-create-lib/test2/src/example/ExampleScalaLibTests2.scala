/**
 * Copyright (c) 2026 Florian Mantz
 * under MIT - License (see LICENSE file)
 */
package example

import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class ExampleScalaLibTests2 extends AnyFlatSpec with Matchers {
    "generateHtmlHeadLine" should "work as expected" in {
      val result = ExampleScalaLib.generateHtmlHeadLine("hello")
      result shouldBe "<h1>hello</h1>"
    }
    it should "escape html characters properly" in {
      val result = ExampleScalaLib.generateHtmlHeadLine("<hello>")
      result shouldBe "<h1>&lt;hello&gt;</h1>"
    }
    "generateHtmlTable" should "create a correct html table" in {
      val result = ExampleScalaLib.generateHtmlTable(
        Array("alpha", "beta", "gamma"),
        Array(Array("1", "2", "3"), Array("10", "20", "30"))
      )
      result shouldBe
        """
          |<html>
          |  <head></head>
          |  <body>
          |    <table>
          |      <thead>
          |        <tr>
          |          <th>Alpha</th>
          |          <th>Beta</th>
          |          <th>Gamma</th>
          |        </tr>
          |      </thead>
          |      <tbody>
          |        <tr>
          |          <td>1</td>
          |          <td>2</td>
          |          <td>3</td>
          |        </tr>
          |        <tr>
          |          <td>10</td>
          |          <td>20</td>
          |          <td>30</td>
          |        </tr>
          |      </tbody>
          |    </table>
          |  </body>
          |</html>
          |""".stripMargin.trim
    }
}
