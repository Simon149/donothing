
organization := "edu.berkeley.css"

version := "1.0"

name := "donothing"
scalaVersion := "2.12.10"

scalacOptions ++= Seq(
  "-feature",
  "-language:reflectiveCalls",
)

// Chisel 3.5
addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.5.2" cross CrossVersion.full)
libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.5.2"
libraryDependencies += "edu.berkeley.cs" %% "chiseltest" % "0.5.2"
