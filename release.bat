echo off
call mvn clean release:prepare release:perform -B -Pd -fn
call mvn clean deploy -B -Pd -fn
call git push --all -u
call git push --tag -u