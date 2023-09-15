
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
        stage('Deployment') {
            steps {
               pushToCloudFoundry cloudSpace: 'dev', credentialsId: '254a456a-8b27-44a3-bee7-5538e31718cc', organization: ' 3cd7cd57trial', target: 'https://api.cf.ap21.hana.ondemand.com'
            }
        }
     
}
}
