# maven1

This maven project is pretty simple to deploy on your local computer:
PRE-REQUISITES:-
Install maven using the steps from https://maven.apache.org/install.html. You should add $MAVEN_HOME/bin to your PATH variable
if using linux which will make the "mvn" executable from everywhere.

STEPS:-
1) git clone https://github.com/vsodha30/maven1.git
2) cd /path/to/above/cloned/maven1
3) Run simple commands if you want:-
--- mvn clean
--- mvn compile
--- mvn package
--- mvn test       ( Used to run the unit tests defined for the code. It will display on terminal the successes and failures)
--- mvn site
--- mvn tomcat:deploy
4) You can check the documentation produced by going into "site" folder inside the "maven1" folder and open the "index.html" 
file using the any browser you like.
5) If you want to run:- 
then cd into maven1/target/classes.......
and execute command like below:-
maven1/target/classes$ java com.mavenfundamentals.simplejavaproject.App

.........................
5) If you wanna go simple way then execute jar file like:-
cd into maven1/target then execute below command from terminal 
java -jar simplejavaproject.jar
