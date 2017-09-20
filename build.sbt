val scalaVer = "2.12.3"

val metaVersion = "1.8.0"

val paradiseVersion = "3.0.0-M10"

val sireumScalacVersion = "3.1.2"

val commonSettings = Seq(
  organization := "org.sireum",
  incOptions := incOptions.value.withLogRecompileOnMacro(false),
  retrieveManaged := true,
  scalaVersion := scalaVer,
  sources in(Compile, doc) := Seq.empty,
  scalacOptions := Seq("-target:jvm-1.8", "-deprecation",
    "-Ydelambdafy:method", "-feature", "-unchecked", "-Xfatal-warnings"),
  parallelExecution in Test := true,
  libraryDependencies ++= Seq(
    "org.scalameta" %% "scalameta" % metaVersion
  ),
  resolvers += Resolver.sonatypeRepo("public"),
  addCompilerPlugin("org.scalameta" % "paradise" % paradiseVersion cross CrossVersion.full),
  addCompilerPlugin("org.sireum" %% "scalac-plugin" % sireumScalacVersion)
)

lazy val sireumMacros = Project(
  id = "sireum-macros",
  base = file("runtime/macros/shared"),
  settings = commonSettings ++ Seq(
    name := "macros",
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % scalaVer,
      "org.spire-math" %% "spire" % "0.13.0"
    )
  )
)

lazy val sireumLibrary = Project(
  id = "sireum-library",
  base = file("runtime/library/shared"),
  settings = commonSettings ++ Seq(
    name := "library",
    libraryDependencies ++= Seq(
      "org.scala-lang.platform" %% "scalajson" % "1.0.0-M4",
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )
).dependsOn(sireumMacros)

lazy val slang = Project(
  id = "slang",
  base = file("slang"),
  settings = commonSettings ++ Seq(
    name := "slang",
    testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-l", "SireumAadlTest"),
    unmanagedBase in Test := baseDirectory.value / "test_lib",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )
).dependsOn(sireumMacros, sireumLibrary)
