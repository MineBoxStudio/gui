plugins {
    id("gui.publishing-conventions")
}

dependencies {
    api(libs.annotations)

    arrayOf("validation", "bukkit").forEach {
        compileOnly("team.unnamed:commons-$it:3.2.0")
    }

    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
}