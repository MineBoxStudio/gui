plugins {
    id("gui.publishing-conventions")
}

dependencies {
    api(project(":gui-item-api"))
    compileOnly("com.mojang:authlib:3.16.29")
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
}