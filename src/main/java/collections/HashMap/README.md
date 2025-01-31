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