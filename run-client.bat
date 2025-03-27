@echo off
echo Starting NetCommHub Client...
echo Make sure the server is already running.
echo.

mkdir -p out
echo Compiling if needed...
javac -d out src\main\java\com\netcommhub\Main.java src\main\java\com\netcommhub\client\*.java src\main\java\com\netcommhub\client\ui\*.java src\main\java\com\netcommhub\client\handlers\*.java src\main\java\com\netcommhub\server\*.java src\main\java\com\netcommhub\common\message\*.java src\main\java\com\netcommhub\common\util\*.java

echo.
echo Starting client:
echo.
java -cp out com.netcommhub.Main client
