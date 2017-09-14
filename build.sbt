val scalaVer = "2.12.3"

val metaVersion = "1.8.0"

val paradiseVersion = "3.0.0-M10"

val silencerVersion = "0.5"

val sireumScalacVersion = "3.1.2"

val commonSettings = Seq(
  organization := "org.sireum",
  incOptions := incOptions.value.withNameHashing(true),
  incOptions := incOptions.value.withLogRecompileOnMacro(false),
  retrieveManaged := true,
  scalaVersion := scalaVer,
  scalacOptions := Seq("-target:jvm-1.8", "-deprecation",
    "-Ydelambdafy:method", "-feature", "-unchecked", "-Xfatal-warnings"),
  parallelExecution in Test := true,
  libraryDependencies ++= Seq(
    "org.scalameta" %% "scalameta" % metaVersion
  ),
  resolvers += Resolver.sonatypeRepo("public"),
  addCompilerPlugin("org.scalameta" % "paradise" % paradiseVersion cross CrossVersion.full)
)

lazy val sireumMacros = Project(
  id = "sireum-macros",
  base = file("runtime/macros/shared"),
  settings = commonSettings ++ Seq(
    name := "macros",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "scalameta" % metaVersion,
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
      "org.scalameta" %% "scalameta" % metaVersion, 
      "org.scalatest" %% "scalatest" % "3.0.1" % "test",
      "com.github.ghik" %% "silencer-lib" % silencerVersion
    ),
    addCompilerPlugin("com.github.ghik" %% "silencer-plugin" % silencerVersion),
    addCompilerPlugin("org.sireum" %% "scalac-plugin" % sireumScalacVersion)
  )
).dependsOn(sireumMacros)

lazy val slang = Project(
  id = "slang",
  base = file("slang"),
  settings = commonSettings ++ Seq(
    name := "slang",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "scalameta" % metaVersion,
      "org.scala-lang" % "scala-reflect" % scalaVer
    ),
    addCompilerPlugin("org.sireum" %% "scalac-plugin" % sireumScalacVersion)
  )
).dependsOn(sireumMacros, sireumLibrary)
