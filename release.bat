call mvn clean release:prepare release:perform -B -Pd -fae
call git push --tag -u