rootProject.name = "TVBox"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven("https://chaquo.com/maven")
        maven("https://jitpack.io")
        maven("https://maven.aliyun.com/repository/releases")
        maven("https://chaquo.com/maven")
        maven("https://maven.aliyun.com/repository/public")
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        maven("https://chaquo.com/maven")
        maven("https://jitpack.io")
        maven("https://maven.aliyun.com/repository/releases")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://chaquo.com/maven")
    }
}

include(":app")
include(":quickjs")
include(":pyramid")
