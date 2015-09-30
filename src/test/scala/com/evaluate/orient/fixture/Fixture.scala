package com.evaluate.orient.fixture

import gremlin.scala.ScalaGraph
import org.apache.tinkerpop.gremlin.orientdb.OrientGraphFactory


trait Fixture {
  val graph = new OrientGraphFactory("remote:x6.ojuba.com/GratefulDeadConcerts","admin","admin").getNoTx
//  val graph = new OrientGraphFactory("remote:x6.ojuba.com/GreatfulDeadConcerts","admin","admin").getNoTx
//  val graph = new OrientGraphFactory("remote:x6.ojuba.com/GreatfulDeadConcerts","root","4236D3FEDF0DB82F3CF03D39F85223CBD9D618D05912E93E901286A012A99F0A").getNoTx
//  val graph = new OrientGraphFactory(s"memory:test-${math.random}").getNoTx()
  val sg = ScalaGraph(graph)
}

trait TinkerpopFixture extends Fixture {

   val marko = sg.addVertex("person", Map("name" -> "marko", "age" -> 29))
   val vadas = sg.addVertex("person", Map("name" -> "vadas", "age" -> 27))
   val lop = sg.addVertex("software", Map("name" -> "lop", "lang" -> "java"))
   val josh = sg.addVertex("person", Map("name" -> "josh", "age" -> 32))
   val ripple = sg.addVertex("software", Map("name" -> "ripple", "lang" -> "java"))
   val peter = sg.addVertex("person", Map("name" -> "peter", "age" -> 35))

   marko.addEdge("knows", vadas, Map("weight" -> 0.5d))
   marko.addEdge("knows", josh, Map("weight" -> 1.0d))
   marko.addEdge("created", lop, Map("weight" -> 0.4d))
   josh.addEdge("created", ripple, Map("weight" -> 1.0d))
   josh.addEdge("created", lop, Map("weight" -> 0.4d))
   peter.addEdge("created", lop, Map("weight" -> 0.2d))
 }