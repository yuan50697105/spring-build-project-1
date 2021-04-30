echo off
call mvn clean release:prepare release:perform -B -Pd
