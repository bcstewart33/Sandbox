####
# Java Makefile
####

JFLAGS = -g
JC = javac
#JVM = java
FILE=

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
    sandbox.java

MAIN = SandBox

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) $(MAIN)

clean:
	del *.class
