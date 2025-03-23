# SlimeyData
SlimeyData aims to be a simple API for storing arbitrary data on any object
without the need to create different methods inside of classes.

```java
public class Keys {
    public static final Key<String> MY_KEY = Key.of(ResourceKey.of("example", "my_key"));
}

public class MyDataHolder extends DataHolder {
    // ... other methods ...
}

public class Main {
    public static void main(final String[] args) {
        MyDataHolder myDataHolder = new MyDataHolder();
        myDataHolder.offer(Keys.MY_KEY, "hello!");
        myDataHolder.get(Keys.MY_KEY).ifPresent(value -> {
            // Use the value of the key!
            System.out.println(value); // Prints: "hello"
        });
    }
}
```

## The theory
### Data storage types
A `DataStorage` type allows implementation of data storage, for instance `Key`,
which does not itself store a value, but rather sets the type of value to store so that
it can be used in a `DataHolder`.

### Data holders
A `DataHolder` is something which holds data, you may `offer` it data or `get`
it (in the form of an optional)

```java
myDataHolder.offer(Keys.MY_KEY, "hello!");
myDataHolder.get(Keys.MY_KEY).ifPresent(value -> {
    // Use the value of the key!
    System.out.println(value); // Prints: "hello"
});
```

### Resource Keys
A `ResourceKey` stores a **namespace** and an **id**, this is intended for developers
to use when storing them in some form of persistent storage (like a database)

> Persistent storage is not currently implemented in this API!
> This is the intention of resource keys: developers implement persistent storage.

## Inspiration
[SpongeAPI](https://github.com/SpongePowered/SpongeAPI) has a very similar system which
I thought was super cool and useful, but I didn't want to depend on Sponge's systems
so I made my own!