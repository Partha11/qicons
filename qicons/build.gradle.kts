plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.secrets.gradle.plugin)
    id("maven-publish")
}

android {
    namespace = "com.quorso.icons"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

secrets {
    propertiesFileName = "secrets.properties"
    defaultPropertiesFileName = "local.defaults.properties"
}

val githubUserName = project.findProperty("GITHUB_USER") as String? ?: ""
val githubRepository = project.findProperty("GITHUB_REPOSITORY") as String? ?: ""
val githubAccessToken = project.findProperty("GITHUB_ACCESS_TOKEN") as String? ?: ""

publishing {
    publications {
        create<MavenPublication>("aar") {
            groupId = "com.quorso"
            artifactId = "icons"
            version = "1.0.0"

            // Specify the AAR file as the artifact
            artifact("${layout.buildDirectory.get()}/outputs/aar/${project.name}-release.aar") {
                extension = "aar"
            }
        }
    }
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/$githubRepository")
            credentials {
                username = githubUserName
                password = githubAccessToken
            }
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}