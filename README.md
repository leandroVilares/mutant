Project Mutant
Foi criado um projeto em Java baseado na tecnologia Srping Boot.

1- Instruções para executar o o programa .
java -jar Magnetto-1.0.0.jar

2 executar  post.
example: ["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]

3 - aplicação utiliza um banco de dados Embargado utilizando o banco H2.

4 -Pom xml.

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.leandrovilarees</groupId>
	<artifactId>Magnetto</artifactId>
	<version>1.0.0</version>
	<packaging>jar</packaging>

	<name>Magnettoe</name>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.4.3.RELEASE</version>
	</parent>

	<properties>
		<java.version>1.8</java.version>
		<!-- Additionally, Please make sure that your JAVA_HOME is pointing to 
			1.8 when building on commandline -->
	</properties>

	<dependencies>
		<!-- Add typical dependencies for a web application -->
		<!-- Adds Tomcat and Spring MVC, along others -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
    		<groupId>com.fasterxml.jackson.dataformat</groupId>
    		<artifactId>jackson-dataformat-xml</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			
		</dependency>
		
		
	</dependencies>
	<build>
		<plugins>
			<plugin><!-- Include if you want to make an executable jar[FAT JAR which 
					includes all dependencies along with sprinboot loader] that you can run on 
					commandline using java -jar NAME -->
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
</project>
