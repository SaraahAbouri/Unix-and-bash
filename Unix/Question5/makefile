SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

JUNIT = ./gson/gson-2.6.2.jar -sourcepath ./src ./src/$*.java


JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)


vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: CSVreader.class Dam.class DamArrayApp.class\
		

default: $(CLASSES)

doc:
	javadoc -d $(DOCDIR) -cp $(DOCDIR) $(SRCDIR)/*.java

test_classes: CSVreader.class Dam.class DamArrayApp.class
	      
junit: test_classes
	
CSVreader.class: CSVreader.java
	javac -d $(BINDIR) -cp $(JUNIT)
Dam.class: Dam.java
	javac -d $(BINDIR) -cp $(JUNIT)
DamArrayApp.class: DamArrayApp.java
	javac -d $(BINDIR) -cp $(JUNIT)

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc