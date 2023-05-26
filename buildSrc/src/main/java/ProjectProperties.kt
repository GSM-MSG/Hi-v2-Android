import org.gradle.api.JavaVersion

object ProjectProperties {
    object Gradle {
        const val APPLICATION = "com.android.application"
        const val LIBRARY = "com.android.library"
        const val KOTLIN = "org.jetbrains.kotlin.android"
        const val KTLINT = "org.jlleitschuh.gradle.ktlint"
        const val KAPT = "kapt"
        const val HILT = "com.google.dagger.hilt.android"
    }
    object Test {
        const val TEST_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    }

    object Id {
        const val APPLICATION_ID = "team.msg.hi_v2"
    }

    object Files {
        const val CONSUMER_PROGUARDFILES = "consumer-rules.pro"
        const val DEFAULT_PROGUARDFILES = "proguard-android-optimize.txt"
        const val PROGUARDFILES = "proguard-rules.pro"
    }

    object Versions {
        const val COMPILE_SDK = 33
        const val MIN_SDK = 24
        const val TARGET_SDK = 33
        const val JVM_TARGET = "11"
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
        val JAVA_VERSION = JavaVersion.VERSION_11
        const val COMPOSE_COMPILER = "1.4.2"
    }

    object NameSpace {
        const val PRESENTATION = "team.msg.presentation"
        const val DOMAIN = "team.msg.domain"
        const val DATA = "team.msg.data"
        const val APP = "team.msg.hi_v2"
        const val DESIGN_SYSTEM = "team.msg.design_system"
    }

    object Action {
        const val EXCLUDES = "/META-INF/{AL2.0,LGPL2.1}"
    }
}