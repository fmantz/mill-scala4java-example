/**
 * Copyright (c) 2026 Florian Mantz
 * under MIT - License (see LICENSE file)
 */
import example.*
import example.ExampleJavaLibFacade.TableData

import java.util

@main
def libUse(): Unit = {
  // java:
  val rs1 = ExampleJavaLibFacade.generateHtmlHeadLine("hello")
  val data: TableData = new TableData(util.List.of("alpha", "beta", "gamma"), util.List.of(util.List.of("1", "2", "3"), util.List.of("10", "20", "30")))
  val rs2 = ExampleJavaLibFacade.generateHtmlTable(data)

  // can be used as well (but not with scala classes as parameters)
  // since all scala code is shaded
  val rs3 = ExampleScalaLib.generateHtmlHeadLine("<test>")
  val rs4 = ExampleScalaLib.generateHtmlTable(Array("A", "B", "C"), Array(Array("1", "2", "3"), Array("10", "20", "30")))

  println(
    s"""
       |$rs1
       |$rs2
       |$rs3
       |$rs4
       |""".stripMargin
  )
}
