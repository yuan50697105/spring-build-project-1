echo off
call mvn clean dependency:purge-local-repository -B -fae
call mvn clean release:prepare release:perform -B -Pd -T 1C -fn
call mvn clean deploy -B -Pd -T 1C -fn
call git push --all
call git push --tag