plugins {
    kotlin("jvm") version "1.3.61"
    antlr
}

group = "codes.som.anthony"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.hackery.site")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.ow2.asm:asm:7.2")
    implementation("org.ow2.asm:asm-tree:7.2")

    implementation("org.antlr:antlr4-runtime:4.7.2")
    antlr("org.antlr:antlr4:4.7.2")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.generateGrammarSource {
    outputDirectory = File(outputDirectory, "codes/som/anthony/aksara/assembler/parser")
    arguments.addAll(listOf("-package", "codes.som.anthony.aksara.assembler.parser"))
}

tasks.withType<Jar> {
    manifest {
        attributes(mapOf(
                "Main-Class" to "codes.som.anthony.aksara.cli.Main"
        ))
    }

    configurations.compileClasspath {
        forEach { dep ->
            if (!configurations.testCompileOnly.contains(dep)) {
                from(zipTree(dep).matching {
                    include("**/*")

                    exclude("META-INF/*")
                    exclude("META-INF/maven/")
                    include("META-INF/services/")

                    exclude("module-info.class")
                })
            }
        }
    }
}
