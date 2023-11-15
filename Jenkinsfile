@Library('piper-lib-os') _

pipeline {
    agent any
     tools{
         jdk 'sapjdk17'
        maven 'maven'
        }
    stages {
       
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
                      script:this,
                   deployType: 'standard',
                 cloudFoundry: [apiEndpoint:'https://api.cf.ap21.hana.ondemand.com',credentialsId: '4ce54de5-315c-4038-8824-6f9f8849efc0', manifest: 'manifest.yml', org:'0f325a8btrial', space: 'dev'],
                
                    deployTool: 'cf_native'

   )         }
            
               }
          }

}
}
