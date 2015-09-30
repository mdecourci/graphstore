package com.evaluate.orient

import gremlin.scala.ScalaGraph
import org.apache.tinkerpop.gremlin.orientdb.OrientGraphFactory

/**
 * Created by subhash on 28/09/2015.
 */
object DataLoader {
  def main(args: Array[String]): Unit = {
    val graph = new OrientGraphFactory("memory:localhost/barcap","admin","admin").getNoTx
    val sg = ScalaGraph(graph)

    val marko = sg.addVertex("person", Map("name" -> "marko", "age" -> 29))
    val vadas = sg.addVertex("person", Map("name" -> "vadas", "age" -> 27))
    val lop = sg.addVertex("software", Map("name" -> "lop", "lang" -> "java"))
    val josh = sg.addVertex("person", Map("name" -> "josh", "age" -> 32))
    val ripple = sg.addVertex("software", Map("name" -> "ripple", "lang" -> "java"))
    val peter = sg.addVertex("person", Map("name" -> "peter", "age" -> 35))

  }

}
