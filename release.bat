call mvn clean release:prepare release:perform -fn
call mvn clean deploy -fae -Pd -T 0.5
call git push --tag