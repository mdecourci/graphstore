name := "GraphStore"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += Resolver.mavenLocal

val Oversion = "2.1.2"
val titanV = "0.9.0-M2"

fork := true

libraryDependencies ++= Seq(
  "com.michaelpollmeier" % "gremlin-scala_2.10" % "3.0.0.M9-incubating",
  "com.michaelpollmeier" % "orientdb-gremlin" % "3.0.0.M1a",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test",
  "com.orientechnologies" % "orientdb-client" % Oversion,
  //  "com.orientechnologies" % "orientdb-enterprise" % Oversion,
  /*"com.orientechnologies" % "orientdb-core" % Oversion,*/

  "com.thinkaurelius.titan" % "titan-cassandra" % titanV,
  "com.thinkaurelius.titan" % "titan-core" % titanV

  //"org.slf4j" % "slf4j-simple" % "1.6.4"
)
