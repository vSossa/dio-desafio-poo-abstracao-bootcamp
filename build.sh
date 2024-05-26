#! /bin/bash

javac -cp src/ src/Main.java -d bin/
java -cp bin/ Main
