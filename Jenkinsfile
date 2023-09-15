
pipeline {
    agent any
    
     tools{
         jdk 'SAP17'
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
