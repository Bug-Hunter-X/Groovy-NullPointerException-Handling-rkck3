```groovy
def myMethod(param) {
  if (param == null) {
    return null // Correctly handles null input
  }
  // ...rest of the method...
}

myMethod(null) // This works fine

//However

def anotherMethod(param) {
  if (param instanceof String) {
    return param.toUpperCase()
  } else {
    return param //Problem when param is null
  }
}
anotherMethod(null) //Throws NullPointerException because null doesn't have a toUpperCase method
```