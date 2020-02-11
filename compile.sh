#!/bin/bash

# compile
echo "Compiling"

# this needs to be completed before Main
javac ./URLAnalyzer/URLAnalyzer.java -d Bin/ &

wait

javac ./Main/Main.java -d Bin/ &

# wait for compilations to finish
wait

echo "Done Compiling"
printf "\n\n\n"

# run the application
java -cp ./Bin Main -starter_urls starter_urls.txt
