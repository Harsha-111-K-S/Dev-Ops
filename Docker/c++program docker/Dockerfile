FROM gcc:latest

COPY . /usr/src/cpp-app

WORKDIR /usr/src/cpp-app

RUN g++ -o Test cpp_program.cpp

CMD ["./Test"]
