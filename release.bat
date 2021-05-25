call mvn clean release:prepare release:perform -fn
call mvn clean deploy -fae -Pd
call git push --tag