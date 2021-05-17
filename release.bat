echo off
call mvn clean dependency:purge-local-repository -B -fae
call mvn clean release:prepare release:perform -B -Pd -fae
call mvn clean deploy -B -Pd -fae
call git push --all -u
call git push --tag -u