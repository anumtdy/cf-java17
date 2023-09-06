
pipeline {
    agent any
     tools{
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
