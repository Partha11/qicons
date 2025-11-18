<p align="center">
  <img src="img/icon.png" alt="QIcons Logo" width="120" />
</p>

<h1 align="center">QIcons</h1>

<p align="center">
  A simple and beautiful icon library for Android Jetpack Compose. <br />
  This is an icon library project. all the icons are collected from heroicons, and they are converted to compose using valkyrie. this is done because google material icon package lacks some icon, and some icons are more suitable and relatable from the hero icons.
</p>

<p align="center">
  <a href="https://jitpack.io/#Partha11/qicons">
    <img alt="Release" src="https://img.shields.io/jitpack/v/github/Partha11/qicons" />
  </a>
  <a href="https://github.com/Partha11/QIcons/issues">
    <img alt="Issues" src="https://img.shields.io/github/issues/Partha11/QIcons" />
  </a>
  <a href="https://github.com/Partha11/QIcons/blob/main/LICENSE.md">
    <img alt="License" src="https://img.shields.io/github/license/Partha11/QIcons" />
  </a>
  <img alt="Android" src="https://img.shields.io/badge/platform-Android-green" />
</p>

---

## Introduction

Adding custom icons to a Jetpack Compose project can often be a hassle. Converting SVG or XML icons manually often leads to broken or inconsistent results, wasting valuable development time.

**QIcons** aims to simplify this process by providing a collection of high-quality icons converted from [Heroicons](https://heroicons.com). This allows developers to focus on building critical business logic and crafting great user experiences, rather than wrestling with icon conversion tools.

---

## Download

You can download the latest artifact from the [Releases](https://github.com/Partha11/QIcons/releases) section.

> **Note:** This is a free and open-source library. You can use it in your personal and commercial projects.

---

## Usage

To use this library, first, add the JitPack repository to your `settings.gradle.kts` or `settings.gradle` file:

```kotlin
// settings.gradle.kts
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

Now, add the dependency to your project. Choose the method that matches your project's setup.

### Version Catalog (`libs.toml`)

Add the dependency to your `libs.toml` file. Replace the version with the latest release.

```toml
[versions]
qicons = "1.0.3"

[libraries]
qicons = { group = "com.github.Partha11", name = "qicons", version.ref = "qicons" }
```

Then, in your app-level `build.gradle.kts` file, add the dependency:

```kotlin
dependencies {
    implementation(libs.qicons)
}
```

### Kotlin DSL (`build.gradle.kts`)

Add the dependency directly to your app-level `build.gradle.kts` file:

```kotlin
dependencies {
    implementation("com.github.Partha11:qicons:1.0.3")
}
```

### Groovy DSL (`build.gradle`)

Add the dependency to your app-level `build.gradle` file:

```groovy
dependencies {
    implementation 'com.github.Partha11:qicons:1.0.3'
}
```

Now, you can use the icons in your composable functions like this:

```kotlin
import com.quorso.icons.outlined.AcademicCap

@Composable
fun MyScreen() {
    Icon(
        imageVector = QIcons.Outlined.AcademicCap,
        contentDescription = "Academic Cap"
    )
}
```

---

## Available Icons

You can find the complete list of available icons in the following directories:

- [Outlined Icons](./qicons/src/main/java/com/quorso/icons/outlined)
- [Filled Icons](./qicons/src/main/java/com/quorso/icons/filled)

---

## Roadmap / Upcoming Features

- [x] Create Outlined/Filled namespaces
- [ ] Create default namespace
- [ ] Add more icons from other libraries
- [ ] Optimize icon paths

---

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE.md](LICENSE.md) file for details.
The icons are from [Heroicons](https://heroicons.com), which are licensed under the [MIT License](https://github.com/tailwindlabs/heroicons/blob/master/LICENSE).

---

## Contact

For inquiries or business use, please contact:  
<a href="mailto:support@quorso.xyz">support@quorso.xyz</a>

---

## Credits

This library was made possible by the following projects:

- [Heroicons](https://heroicons.com) for the beautiful icon set.
- [Valkyrie](https://github.com/adrielcafe/valkyrie) for converting the icons to Jetpack Compose.

---
