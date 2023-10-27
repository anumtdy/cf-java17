@Library(['piper-lib', 'piper-lib-os']) _

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
                    setupPipelineEnvironment script: this
                }
            }
        }
         stage('Build') {
            steps {
                script{
                    buildExecute script:this, buildTool: 'maven'
                }
               
            }
        }
        stage('Deployment') {
            steps {
               script{
                  cloudFoundryDeploy(
                      script:this,
                   deployType: 'standard',
                   cloudFoundry: [apiEndpoint: 'https://api.cf.ap21.hana.ondemand.com',credentialsId: '4ce54de5-315c-4038-8824-6f9f8849efc0', manifest: 'manifest.yml', org: '3cd7cd57trial', space: 'dev'],
                
                    deployTool: 'cf_native'

   )         }
            
               }
          }

}
}
