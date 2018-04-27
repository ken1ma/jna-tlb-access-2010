The binding has been generated on Windows 7 SP1,
with [matthiasblaesing/TlbCodeGenerator](https://github.com/matthiasblaesing/TlbCodeGenerator) (version 2017-04-17).


# Generate COM libraries

1. Install Maven
	1. For example, download and extract apache-maven-3.5.3-bin.zip

	1. Setup PATH for mvn command, for example

			SET PATH=%HOMEDRIVE%%HOMEPATH%\apache-maven-3.5.3\bin;%PATH%

1. Install TlbCodeGenerator to the local repository

	1. Check out the repository, for example

			git clone https://github.com/matthiasblaesing/TlbCodeGenerator.git
			cd TlbCodeGenerator

	1. Build and install, for example

			SET JAVA_HOME=C:\Program Files\Java\jdk1.8.0_171
			SET PATH=%JAVA_HOME%\bin;%PATH%
			mvn install

1. To find out GUID of the registered COMs

	1. In directory `TlbCodeGenerator`

			mvn eu.doppel_helix.jna.tlbcodegenerator:TlbCodeGenerator:list > ..\TlbCodeGenerator-list.txt

1. In `parent` directory

	1. Install the POM to the local repository

			mvn install

1. For each TLB (`stdole`, `office`, `vbide`, `adodb`, `acedao`, `access`)

	1. Generate the Java binding sources from the TLB

			mvn eu.doppel_helix.jna.tlbcodegenerator:TlbCodeGenerator:generate

	1. Install the Java binding to the local repository

			mvn install


# Dependencies

1. Without `vbide`, `access` would contain for example in Reference.java

		@ComProperty(name = "Kind", dispId = 0x60020008)
		{{0002E157-0000-0000-C000-000000000046}-5-3}.vbext_RefKind getKind();

1. Without `office`, `vbide` would contain for example in VBE.java

		@ComProperty(name = "CommandBars", dispId = 0x6c)
		{{2DF8D04C-5BFA-101B-BDE5-00AA0044DE52}-2-5}.CommandBars getCommandBars();

1. Without `stdole`, `office` would contain for example in _CommandBars.java

		@ComMethod(name = "GetImageMso", dispId = 0x60030024)
		{{00020430-0000-0000-C000-000000000046}-2-0}.Picture GetImageMso(String idMso,
				Integer Width,
				Integer Height);

1. Without `adodb`, `access` would contain for example in _CurrentProject.java

		@ComProperty(name = "Connection", dispId = 0x8e2)
		{{00000205-0000-0010-8000-00AA006D2EA4}-2-5}.Connection getConnection();

1. Without `acedao`, `access` would contain for example in _Application.java

		@ComProperty(name = "DBEngine", dispId = 0x83e)
		{{4AC9E1DA-5BAD-4AC7-86E3-24F4CDCECA28}-12-0}.DBEngine getDBEngine();


# Scala support

This section is documented in case you want experiment with Scala instead of Java.

1. To support Scala, include the followings in `pom.xml`

		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-compiler-plugin</artifactId>
			<version>3.7.0</version>
			<executions>
				<execution>
					<id>default-compile</id>
					<phase>none</phase> <!-- disable the default java compiler -->
				</execution>
			</executions>
		</plugin>

		<plugin>
			<groupId>net.alchim31.maven</groupId>
			<artifactId>scala-maven-plugin</artifactId>
			<version>3.3.2</version>
			<configuration>
				<recompileMode>incremental</recompileMode> <!-- compile both Scala and Java sources -->
			</configuration>
			<executions>
				<execution>
					<goals>
						<goal>compile</goal>
						<goal>testCompile</goal>
					</goals>
				</execution>
			</executions>
		</plugin>

		<dependency>
			<groupId>org.scala-lang</groupId>
			<artifactId>scala-library</artifactId>
			<version>2.12.5</version>
		</dependency>
