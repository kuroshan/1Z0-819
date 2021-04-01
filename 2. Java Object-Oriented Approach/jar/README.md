# COMPILAR JAR
jar --create --verbose --file myNewFile.jar .
jar --cvf myNewFile.jar .
jar --cvf myNewFile.jar -C dir.

# EJECUTAR UNA CLASE DEL JAR
java -cp ".;C:\temp\someOtherLocation;C:\temp\myJar.jar" myPackage.MyClass
java -cp ".:/tmp/someOtherLocation:/tmp/myJar.jar" myPackage.MyClass
java -cp ".:/tmp/someOtherLocation:/tmp/*" myPackage.MyClass

