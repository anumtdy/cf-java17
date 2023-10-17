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
                   cloudFoundry: [apiEndpoint: 'https://api.cf.ap10.hana.ondemand.com',appName:'cf-java17',credentialsId: '254a456a-8b27-44a3-bee7-5538e31718cc', manifest: 'manifest.yml', org:' EngSrvVal-E2E_AU', space: 'QPATools'],
                
                    deployTool: 'cf_native'

   )         }
            
               }
          }

}
}
