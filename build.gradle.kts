

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.python) apply false
}

buildscript {
    dependencies {
        classpath("com.yanzhenjie.andserver:plugin:2.1.12")
    }
}

//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//buildscript {
//    ext.kotlin_version = "1.9.25"
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//        maven { url "https://jitpack.io" }
//        maven { url "https://maven.aliyun.com/repository/releases" }
//        maven { url "https://maven.aliyun.com/repository/public" }
//        maven { url "https://storage.googleapis.com/r8-releases/raw" }
//        maven { url "https://chaquo.com/maven" }
//    }
//    dependencies {
//        classpath 'com.android.tools.build:gradle:7.4.2'
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
//        // NOTE: Do not place your application dependencies here; they belong
//        // in the individual module build.gradle files
//        classpath("com.android.tools:r8:8.5.35")
//        classpath 'com.yanzhenjie.andserver:plugin:2.1.12'
//        classpath "com.chaquo.python:gradle:12.0.1"
//    }
//}
//
//allprojects {
//    repositories {
//        google()
//        mavenCentral()
//        maven { url "https://jitpack.io" }
//        maven { url "https://maven.aliyun.com/repository/releases" }
//        maven { url "https://maven.aliyun.com/repository/public" }
//        gradlePluginPortal()
//    }
//}
//
//tasks.register('clean', Delete) {
//    delete rootProject.buildDir
//}
