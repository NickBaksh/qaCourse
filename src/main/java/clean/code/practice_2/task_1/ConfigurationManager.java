package clean.code.practice_2.task_1;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private String dbUrl;
    private String dbUserName;
    private String dbPassword;

    private String filePath;

    private String logLevel;
    private String logPath;

    private ConfigurationManager() {
        this.dbUrl = "jdbc:mysql://localhost:3306/app_db";
        this.dbUserName = "admin";
        this.dbPassword = "admin";

        this.filePath = "/var/app/storage";

        this.logLevel = "HIGH";
        this.logPath = "/var/app/storage/logs/app.log";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogPath() {
        return logPath;
    }
}
