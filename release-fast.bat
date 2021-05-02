echo off
call mvn clean release:prepare release:perform -B -Pd -T 1C
call mvn clean deploy -B -Pd -T 1C
call mvn clean -T 1C