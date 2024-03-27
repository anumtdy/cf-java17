@Library(['piper-lib','piper-lib-os']) _

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
       /* stage('Deployment') {
            steps {
               script{
                  cloudFoundryDeploy(
                      script:this,
                   deployType: 'standard',
                 cloudFoundry: [apiEndpoint:'https://api.cf.ap21.hana.ondemand.com',credentialsId: 'cftrial',manifest: 'manifest.yml', org:'0f325a8btrial', space: 'dev'],
                
                    deployTool: 'cf_native'

   )         }
            
               }
          }*/

}
}
