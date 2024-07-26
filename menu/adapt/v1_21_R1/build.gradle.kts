plugins {
    id("gui.publishing-conventions")
    id("io.papermc.paperweight.userdev") version "1.7.1"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }
    reobfJar {
        paperweight.reobfArtifactConfiguration.set(io.papermc.paperweight.userdev.ReobfArtifactConfiguration.REOBF_PRODUCTION)
    }
}


dependencies {
    api(project(":gui-menu-api"))
    paperweight.paperDevBundle("1.21-R0.1-SNAPSHOT")
}