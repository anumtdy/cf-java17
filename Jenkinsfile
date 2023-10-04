@Library(['piper-lib', 'piper-lib-os']) _
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

}
}
