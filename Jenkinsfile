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
                // Safely create the jars folder (won’t fail if it already exists)
                bat '''
                    if not exist "C:\\Users\\US shift presales\\Documents\\Jenkins\\sample\\jars" (
                        mkdir "C:\\Users\\US shift presales\\Documents\\Jenkins\\sample\\jars"
                    )
                '''
                
                // Copy the built JAR(s) from target to the jars folder
                bat 'copy target\\*.jar "C:\\Users\\US shift presales\\Documents\\Jenkins\\sample\\jars\\"'
            }
        }
    }
}
