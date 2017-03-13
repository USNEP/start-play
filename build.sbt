name := """start-play"""

version := "1.0-SNAPSHOT" 
lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
scalaVersion := "2.11.7"
libraryDependencies ++= Seq(
javaJdbc,
cache,
javaWs,
evolutions,
"com.adrianhurt" %% "play-bootstrap" % "1.1-P25-B3",
"mysql" % "mysql-connector-java" % "5.1.21"
)
