package utils

class Logger {
    static void info(script, String message) {
        script.echo "[INFO] ${message}"
    }
}