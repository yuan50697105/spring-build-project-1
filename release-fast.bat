call mvn release:prepare release:perform -B -Pd -fae -U -T 1C
call git push --tag