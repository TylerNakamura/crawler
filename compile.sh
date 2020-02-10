#!/bin/bash

# compile
echo "Compiling"

javac ./URLAnalyzer/URLAnalyzer.java -d Main/ &

wait

javac ./Main/Main.java -d Main/ &

# wait for compilations to finish
wait

echo "Done Compiling"
printf "\n\n\n"

# run dat shit
java -cp ./Main Main
