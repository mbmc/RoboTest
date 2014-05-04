Android Unit Test (POJO and UI)
====

Context
----

I was working on an Android Library that contains a bunch of components (Fragment, Util etc.) that would be usable across different Apps. Since there's POJO and UI elements, I wanted to be able to test those things without using a device.

I had a hard time having Robolectric and Roboguice working together, and I couldn't find any working example that was also loading Modules for test only. After few days of gathering pieces here and there, I was able to accomplish what I needed.


Usage
----

From Android Studio, Import the project (don't Open it). Note that the tests won't work in the IDE. This small app can be compiled and installed via the usual way.

To run POJO and UI tests (without device):

```sh
./gradlew unitTest # POJO
./gradlew test # UI
```

Frameworks used
----

* Android Studio 0.4.0
* Gradle 1.9
* Roboguice 2.0
* Robolectric 2.2
* android-unit-test plugin 1.0.1


Thanks
----

SuperJugy: https://github.com/JCAndKSolutions/android-unit-test

Roboguice: https://github.com/roboguice/roboguice

Robolectric: https://github.com/robolectric/robolectric

Feel free to comment or change anything.