@echo off
echo Starting NetCommHub Server...
echo The server must be running before any clients can connect.
echo.

mkdir -p out
echo Compiling if needed...
javac -d out src\main\java\com\netcommhub\Main.java src\main\java\com\netcommhub\client\*.java src\main\java\com\netcommhub\client\ui\*.java src\main\java\com\netcommhub\client\handlers\*.java src\main\java\com\netcommhub\server\*.java src\main\java\com\netcommhub\common\message\*.java src\main\java\com\netcommhub\common\util\*.java

echo.
echo Starting server (press Ctrl+C to stop):
echo.
java -cp out com.netcommhub.Main server
