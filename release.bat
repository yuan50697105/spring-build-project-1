call mvn clean release:prepare release:perform -fn
call mvn clean install -fae -Pd -T 4
call git push --tag