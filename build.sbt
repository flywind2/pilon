name := "pilon"

version := "0.8"

scalaVersion := "2.9.2"

scalacOptions += "-deprecation"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies += "commons-lang" % "commons-lang" % "2.6"
