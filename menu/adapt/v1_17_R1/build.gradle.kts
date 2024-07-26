plugins {
    id("gui.publishing-conventions")
    id("io.papermc.paperweight.userdev") version "1.7.1"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    api(project(":gui-menu-api"))
    paperDevBundle("1.17.1-R0.1-SNAPSHOT")
}