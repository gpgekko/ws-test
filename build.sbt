name := """ws-test"""
organization := "nl.semlab"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
   guice,

   "com.typesafe.play" %% "play-json" % "2.6.10" withJavadoc()
)
