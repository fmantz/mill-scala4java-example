# Example Project for Mill Plugin 'scala4java'

Please read further notes on the plugin here:
https://github.com/fmantz/mill-scala4java

The library is build with Scala Version 2.11.12.

## Build the example library with:

```bash
cd mill-create-lib

# For local ivy repo: 
./mill publishLocal

# For local maven repo:
./mill publishM2Local    
```

## Run the example library with:

```bash
cd mill-use/mill

./mill run   
```

OR

```bash
cd mill-use/sbt

sbt run   
```
note: sbt must be installed.

OR

```bash
cd mill-use/maven

mvn compile exec:java   
```

note: maven must be installed.
