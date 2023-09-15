
pipeline {
    agent any
    
     tools{
         jdk 'jdk17.0.8'
        maven 'mavan_spring'
        }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello'
               }
            
             }
       
         stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
     
}
}
