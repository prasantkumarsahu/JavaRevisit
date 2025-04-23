# [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html "HashMap(Java Doc)")

* ## Key Characteristics
  1. _**Unordered**_ : Does not maintain any order of its elements.
  2. _**Allow `null` Keys and Values**_ : Can have one `null` key and multiple `null` values.
  3. _**Not Synchronized**_ : Not `Thread` safe; requires external synchronization if used in a multi-threaded context.
  4. _**Performance**_ : Offers constant-time performance (O(1)) for basic operations like get and put, assuming the hash function disperses elements properly.

* ## Internal Structure of `HashMap`
    * ### Basic Components of `HashMap` :-
      1. _**Key**_ : The identifier used to retrieve the value.
      2. _**Value**_ : The data associated with the key.
      3. _**Bucket**_ : A place where key-value pairs are stored. Think of buckets as cells in a list (array).
      4. _**Hash Function**_ : Converts a key into an index (bucket location) for storage.
      
      #### Hash Function :-
        * A hash function is an algorithm that takes an input (or "key") and returns a fixed-size string of bytes, a typically a numerical value.
        * The output is known as a hash code, hash value, or simple hash.
        * The primary purpose of a hash function is to map data of arbitrary size to data of fixed size.
      
      ##### Key characteristics :-
        * **Deterministic:** The same  input will always produce the same output.
        * **Fixed Output Size:** Regardless of the input size, the hash code has a consistent size (e.g., 32-bit, 64-bit).
        * **Efficient Computation:** The hash function should compute the hash quickly.
  
* ## How Data is Stored in `HashMap`
  1. ### _**Step 1: Hashing the Key**_
     - First, the key is passed through a hash function to generate a unique hash code (an integer number).
     - This hash code helps determine where the key-value pair will be stored in the array (called a "bucket array").
  2. ### _**Step 2: Calculating the Index**_ 
     - The hash code is then used to calculate an index in the array (bucket location) using
       ```Java
        int index = hashCode % arraySize;
       ```
     - The index decides which bucket will hold this key-value pair.
     - For example, if the array size is 16(**By Default**), the key's hash code will be divided by 16, and the reminder will be the index.
  3. ### _**Step 3: Storing in the Bucket**_
     - The key-value pair is stored in the bucket at the calculated index.
     - Each bucket can hold multiple key-value pairs (this is called a collision handling mechanism, discussed later).

* ## How `HashMap` Retrieves Data
  ### When we call `get(key)`, the `HashMap` follows these steps:
  - _**Hashing the Key**_ : Similar to insertion, the key is hashed using the same hash function to calculate it's hash code.
  - _**Finding the Index**_ : The hash code is used to find the index of the bucket where the key-value pair is stored.
  - _**Searching in the Bucket**_ : Once the correct bucket is found, it checks for the key in that bucket. If it finds the key, it returns the associated value.

  ### Handling Collisions
  * Since different keys can generate the same index (called a collision), `HashMap` uses a technique to handle this situation. Java's `HashMap` uses Linked Lists (or balanced trees after Java 8) for this.
  * If multiple key-value pairs map to the same bucket, they are stored in a linked list inside the bucket.
  * When a key-value pair is retrived, the `HashMap` traverses the `LinkedList`, checking each key until it finds a match.
