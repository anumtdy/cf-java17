
pipeline {
    agent any
    
     tools{
         
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
                sh 'mvn clean install'
            }
        }
     
}
}
