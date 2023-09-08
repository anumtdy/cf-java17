
pipeline {
    agent any
     environment {
       DISABLE_AUTH = 'true'                              
   }
     tools{
         jdk 'jdk17'
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
