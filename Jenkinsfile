pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    // Use the Maven tool configured in Jenkins
                    def mvnHome = tool name: 'Maven', type: 'maven'
                    bat "\"${mvnHome}\\bin\\mvn\" clean install"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    def mvnHome = tool name: 'Maven', type: 'maven'
                    bat "\"${mvnHome}\\bin\\mvn\" test"
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    def mvnHome = tool name: 'Maven', type: 'maven'
                    bat "\"${mvnHome}\\bin\\mvn\" package -DskipTests"
                }
            }
        }

        stage('Deploy') {
            steps {
                bat 'mkdir jars || echo Already exists'
                bat 'copy target\\*.jar jars\\'
            }
        }
    }
}
