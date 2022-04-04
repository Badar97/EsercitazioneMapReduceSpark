javac -cp $(hadoop classpath) -d build/ChallengeMaxFind src/ChallengeMaxFind*.java
jar cvf ChallengeMaxFind.jar -C build/ChallengeMaxFind .
javac -cp $(hadoop classpath) -d build/ChallengeWordCount src/ChallengeWordCount*.java
jar cvf ChallengeWordCount.jar -C build/ChallengeWordCount .


