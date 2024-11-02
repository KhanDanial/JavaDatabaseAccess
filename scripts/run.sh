#!/bin/bash
# Run the compiled Java program
java -cp .:lib/mysql-connector-java-8.0.x.jar:out EmployeeFetcher
echo "Execution complete."
