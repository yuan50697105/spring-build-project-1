call mvn clean release:prepare release:perform -B -Pd -T 1C -fae -U
call git push --tag -u