# Testing in Android

##### Why we require testing in android:
- Helps catching bugs
- To ensure clean and modular code
- Testing code in isolation so as to ensure that error happened from that part of code

##### Types of testing:
- Logic testing - JUnit
- Android framework testing - Intrumentation Test (UI test and No UI test)

##### Dependencies types:
- testImplementation
- androidTestImplementation

##### Unit Testing structure

```
@Test
fun testAdd(){
  //Arrange
  //Act
  //Assert
}
```

