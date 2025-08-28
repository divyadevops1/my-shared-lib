def call(String env) {
    echo "Deploying to environment: ${env}"
    if (!(env in ["dev", "staging", "prod"])) {
    error "Invalid environment: ${env}"
}

    echo "Deployment successful to ${env}!"
}
