call mvn clean release:prepare release:perform -B -Pd -T 1C -fae
call git push --tag