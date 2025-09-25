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
                // Create the jars folder inside your project if it doesn't exist
                bat 'mkdir "C:\\Users\\US shift presales\\Documents\\Jenkins\\sample\\jars" || echo Already exists'
                
                // Copy the built JAR(s) from target to the jars folder
                bat 'copy target\\*.jar "C:\\Users\\US shift presales\\Documents\\Jenkins\\sample\\jars\\"'
            }
        }
    }
}
