Android Unit Test (POJO and UI)
====

Context
----

Be able to run unit and UI test (without device) on an Android project that is also using a Library, with Roboguice, Robolectric and test Modules.


Usage
----

From Android Studio, Import the project (don't Open it). Note that the tests won't run through the IDE. This small app can be compiled and installed via the usual way.

To run POJO and UI tests:

```sh
./gradlew unitTest # POJO
./gradlew test # UI
```

Versions used
----

* Android Studio 1.0 RC1
* Gradle 2.2
* Gradle-plugin 0.14.4
* Roboguice 2.0
* Robolectric 2.2
* android-unit-test plugin 2.0.2
* minSDK 14
* targetSDK 21


Thanks
----

SuperJugy: https://github.com/JCAndKSolutions/android-unit-test

Roboguice: https://github.com/roboguice/roboguice

Robolectric: https://github.com/robolectric/robolectric

Feel free to comment or change anything.