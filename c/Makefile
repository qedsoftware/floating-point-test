# William Wu, 2014-03-13
# floating_point_test

# choice of compiler 
CC = gcc

# includes directory
INCLUDES = /usr/local/include

# library flags
LFLAGS = -L/usr/local/lib
LIBS =

# compiler flags -- command-line options are:
# make mode=release
# make mode=development
# make mode=debug (default)
ifeq ($(mode),release)
	CFLAGS = -O2 -Wall -I$(INCLUDES)
else ifeq ($(mode),development)
	CFLAGS = -O2 -g -Wall -I$(INCLUDES)
else 
	CFLAGS = -O0 -g -Wall -Werror -I$(INCLUDES)
endif

# name of final program
OUTPUT = floating_point_test

# all -- build program and test it
all: $(OUTPUT)

# linking -- put object files together into machine-code
$(OUTPUT): floating_point_test.o
	$(CC) $(CFLAGS) -o $(OUTPUT) floating_point_test.o $(LFLAGS) $(LIBS)

# compilation -- create individual assembly-language object files
floating_point_test.o: floating_point_test.c
	$(CC) $(CFLAGS) -c floating_point_test.c

# clean -- remove object files and program
clean:
	-rm -rf *.o $(OUTPUT)