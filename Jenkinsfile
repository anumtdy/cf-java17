@Library(['piper-lib', 'piper-lib-os']) _
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello'
               }
            
             }
        stage('Init workspace and checkout the code') {
            steps {
                script {
                    setupPipelineEnvironment script: this
                    checkout scm
                }
            }
        }
       stage('Deployment') {
            steps {
               script{
                  cloudFoundryDeploy(
                   script: script,
                   deployType: 'blue-green',
                   cloudFoundry: [apiEndpoint: 'https://api.cf.ap21.hana.ondemand.com', appName:'cf-java17', credentialsId: '4ce54de5-315c-4038-8824-6f9f8849efc0', manifest: 'manifest.yml', org:    '3cd7cd57trial', space: 'dev'],
                deployTool: 'cf_native'


   )         }
            
               }
          }
}
}
