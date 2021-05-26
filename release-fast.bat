call mvn clean release:prepare release:perform -fn -T 0.5C 
call mvn clean deploy -fae -Pd -T 0.5C
call git push --tag