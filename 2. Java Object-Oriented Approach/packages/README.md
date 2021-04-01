javac packagea/ClassA.java packageb/ClassB.java
javac packagea/*.java packageb/*.java
javac packageb/ClassB.java
java packageb/ClassB


javac -d classes packagea/ClassA.java packageb/ClassB.java
java -cp classes packageb.ClassB
java -classpath classes packageb.ClassB
java --class-path classes packageb.ClassB
