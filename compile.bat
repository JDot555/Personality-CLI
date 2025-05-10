@echo off
REM Create the compiled directory if it doesn't exist
if not exist compiled (
    mkdir compiled
)

REM Compile all Java files into the compiled folder
javac -d compiled Main.java Q2.java Q3.java Q4.java Total.java

echo Compilation finished.
