```java
// Type is the type of the elements to be added in the Array List
ArrayList<Type> arr = new ArrayList<Type>();

// Example
ArrayList<String> arr = new ArrayList<>();

// Doesn't work with primitive datatypes, have to use wrapper classes
ArrayList<Integer> arr = new ArrayList<>();

// Creating an ArrayList with initial capacity equal to 50
ArrayList<String> arr = new ArrayList<50>();

// Wrapper class
List<String> list = Arrays.asList(new String[]{"foo", "bar"});
List<String> arr = new ArrayList<List>();

// We can store objects of various types in this ArrayList instance.
// Empty ArrayList with initial capacity
// If you want to create an ArrayList instance which can store objects of multiple types, don't parametrize the instance
ArrayList arr = new ArrayList<>();

arr.add(Integer.valueOf(1));
arr.add(String.valueOf("Scaler"));
```