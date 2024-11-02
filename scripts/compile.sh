#!/bin/bash
# Compile the Java source code
javac -cp .:lib/mysql-connector-java-8.0.x.jar src/EmployeeFetcher.java -d out/
echo "Compilation complete."
