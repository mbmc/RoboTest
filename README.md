I had a hard time to have Robolectric and Roboguice working together, and I couldn't find any working example that was also loading Modules for test only.
After few days of gathering pieces here and there, I was able to accomplish what I needed.

This small app shows how I can run POJO and UI (without device) tests:
./gradlew unitTest // POJO
./gradlew test // UI

I used:
- Android Studio v0.2.10
- Gradle 1.8
- Roboguice 2.0
- Robolectric 2.1
- android-unit-test plugin 1.0.1

Thanks to:
SuperJugy: https://github.com/JCAndKSolutions/android-unit-test
The people from Roboguice: https://github.com/roboguice/roboguice/tree/master/astroboy

Feel free to comment or change.