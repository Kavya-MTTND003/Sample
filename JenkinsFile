pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building Spring Boot project...'
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging JAR...'
                bat 'mvn package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying JAR to jars folder...'
                bat 'if not exist jars mkdir jars'
                bat 'copy target\\*.jar jars\\'
            }
        }
    }
}
