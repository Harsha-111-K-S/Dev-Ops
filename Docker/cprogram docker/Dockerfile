FROM gcc:latest

COPY . /usr/src/c_program

WORKDIR /usr/src/c_program
 
RUN gcc -o Test ccheck.c

CMD ["./Test"]