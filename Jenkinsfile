
pipeline {
    agent any
    
     tools{
         jdk 'jdk17.7'
        maven 'maven'
        }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello'
               }
            
             }
       
         stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
     
}
}
