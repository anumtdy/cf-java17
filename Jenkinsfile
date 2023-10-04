@Library(['piper-lib', 'piper-lib-os']) _
sapPiperPipeline script: this 
pipeline {
    agent any
     tools{
         jdk 'sapjdk17'
        maven 'maven'
        }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello'
               }
            
             }
        stage('Init workspace and checkout the code') {
            steps {
                script {
                   
                    checkout scm
                }
            }
        }
         stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Deployment') {
            steps {
               script{
                  cloudFoundryDeploy(
                
                   cloudFoundry: [apiEndpoint: 'https://api.cf.ap21.hana.ondemand.com',credentialsId: 'cftrial', manifest: 'manifest.yml', org:'3cd7cd57trial', space: 'dev'],
                


   )         }
            
               }
          }

}
}
