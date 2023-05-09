plugins {
    id(ProjectProperties.Gradle.APPLICATION) version Versions.GRADLE apply false
    id(ProjectProperties.Gradle.LIBRARY) version Versions.GRADLE apply false
    id(ProjectProperties.Gradle.KOTLIN) version Versions.KOTLIN apply false
    id(ProjectProperties.Gradle.KTLINT) version Versions.KTLINT
}
