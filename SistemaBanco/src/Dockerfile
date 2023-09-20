# indicar a versão jdk
FROM openjdk:11

#enviar arquivo java para o container
COPY SistemaBancarioSpringApplication.java .

#fazendo a compilação do arquivo
RUN javac SistemaBancarioSpringApplication.java

#comando para executar aplicação java
CMD ["java","SistemaBancarioSpringApplication" ]