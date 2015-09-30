package com.evaluate.orient.fixture

import org.scalatest.{BeforeAndAfter, ShouldMatchers, WordSpec}

/**
 * Created by michaeldecourci on 29/09/15.
 */
class MaxRecordsSpecTest extends WordSpec with BeforeAndAfter with ShouldMatchers {

  "A graph database" should {
    "be capable of storing 300M records" in  new Fixture {
      // create Person entity in loop add edge to neigbour
      //var count : Int = 0
      for (count <- 1 to 30) {
        println("Count = " + count)
        sg.addVertex("entity" + count, Map("value" + count->count*10))
      }
    }
  }

}
