package clean.code.practice_2.task_12;

public class Main {
    public static void main(String[] args) {
        ConditioningOperator conditioningOperator = new ConditioningOperator();
        LightOperator lightOperator = new LightOperator();
        SecuritySystemOperator securitySystemOperator = new SecuritySystemOperator();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(conditioningOperator, lightOperator, securitySystemOperator);
        smartHomeFacade.turnOnAllSystems();

        smartHomeFacade.turnOffAllSystems();
    }
}
