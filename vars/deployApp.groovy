def call(String env) {
    echo "Deploying to environment: ${env}"
    if (env != "dev" && env != "prod") {
        error "Invalid environment: ${env}"
    }
    echo "Deployment successful to ${env}!"
}
