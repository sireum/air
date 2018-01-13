val scalaVer = "2.12.4"

val sireumScalacVersion = "3.2.1"

val commonSettings = Seq(
  organization := "org.sireum",
  incOptions := incOptions.value.withLogRecompileOnMacro(false),
  scalaVersion := scalaVer,
  scalacOptions := Seq("-target:jvm-1.8", "-deprecation",
    "-Ydelambdafy:method", "-feature", "-unchecked", "-Xfatal-warnings"),
  parallelExecution in Test := true,
  resolvers += Resolver.sonatypeRepo("public"),
  addCompilerPlugin("org.sireum" %% "scalac-plugin" % sireumScalacVersion)
)

lazy val sireumMacros = Project(
  id = "sireum-macros",
  base = file("runtime/macros/shared")).
  settings(
    commonSettings ++ Seq(
      name := "macros",
      libraryDependencies ++= Seq(
        "org.scala-lang" % "scala-reflect" % scalaVer,
        "org.spire-math" %% "spire" % "0.13.0"
      )
    )
  )

lazy val sireumLibrary = Project(
  id = "sireum-library",
  base = file("runtime/library/shared")).
  settings(
    commonSettings ++ Seq(
      name := "library",
      libraryDependencies ++= Seq(
        "org.scala-lang.platform" %% "scalajson" % "1.0.0-M4",
        "org.scalatest" %% "scalatest" % "3.0.1" % "test"
      )
    )
  ).dependsOn(sireumMacros)

lazy val slang = Project(
  id = "slang",
  base = file("slang")).
  settings(
    commonSettings ++ Seq(
      name := "slang",
      testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-l", "SireumAadlTest"),
      unmanagedBase in Test := baseDirectory.value / "test_lib",
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.0.1" % "test"
      )
    )
  ).dependsOn(sireumMacros, sireumLibrary)
